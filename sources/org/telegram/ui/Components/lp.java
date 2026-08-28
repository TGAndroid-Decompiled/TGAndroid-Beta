package org.telegram.ui.Components;
public abstract class lp extends m2.a {
    public abstract int j();

    public final int k(int i9) {
        int size = ((zg0) this).f35305c.size();
        int j10 = j();
        if (i9 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i9) - 1)) - 1;
        }
        int i10 = size - j10;
        if (i9 >= i10) {
            return i9 - i10;
        }
        return i9 - j10;
    }
}
