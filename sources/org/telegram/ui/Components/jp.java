package org.telegram.ui.Components;

public abstract class jp extends m2.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((bh0) this).f27100c.size();
        int iJ = j();
        if (i10 < iJ) {
            return ((size - (iJ * 2)) - ((iJ - i10) - 1)) - 1;
        }
        int i11 = size - iJ;
        return i10 >= i11 ? i10 - i11 : i10 - iJ;
    }
}
