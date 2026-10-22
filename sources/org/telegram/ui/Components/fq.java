package org.telegram.ui.Components;
public abstract class fq extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((ki0) this).f27885c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        if (i10 >= i11) {
            return i10 - i11;
        }
        return i10 - j10;
    }
}
