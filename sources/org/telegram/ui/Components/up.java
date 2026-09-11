package org.telegram.ui.Components;
public abstract class up extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((nh0) this).f28748c.size();
        int j3 = j();
        if (i10 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i10) - 1)) - 1;
        }
        int i11 = size - j3;
        if (i10 >= i11) {
            return i10 - i11;
        }
        return i10 - j3;
    }
}
