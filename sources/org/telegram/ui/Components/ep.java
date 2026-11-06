package org.telegram.ui.Components;
public abstract class ep extends c5.a {
    public abstract int j();

    public final int k(int i7) {
        int size = ((rf0) this).f37667c.size();
        int j3 = j();
        if (i7 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i7) - 1)) - 1;
        }
        int i10 = size - j3;
        if (i7 >= i10) {
            return i7 - i10;
        }
        return i7 - j3;
    }
}
