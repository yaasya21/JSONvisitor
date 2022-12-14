package race;

import Visitor.DataElement;
import Visitor.DataElementVisitor;
import character.Stats;

import java.util.TreeMap;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;

    public abstract void print();
    public abstract Stats getRaceBonuses();
    public abstract void saySMTH();
    @Override
    public String toString() {
        return name;
    }
    @Override
    public TreeMap accept(DataElementVisitor vis) {
        return vis.visit((this));
    }

}
