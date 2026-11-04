package org.telegram.ui.Components;
public abstract class ep extends b5.a {
    public abstract int j();

    public final int k(int i3) {
        int size = ((uf0) this).f38733c.size();
        int j10 = j();
        if (i3 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i3) - 1)) - 1;
        }
        int i10 = size - j10;
        if (i3 >= i10) {
            return i3 - i10;
        }
        return i3 - j10;
    }
}
