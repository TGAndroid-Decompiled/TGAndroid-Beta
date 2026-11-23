package org.telegram.ui.Cells;

import org.telegram.messenger.s10;
public final class t7 {
    public int f31842a;
    public int f31843b;
    public int[] f31844c = null;
    public int d = 1;
    public s10 f31845e;

    public final int a() {
        int[] iArr = this.f31844c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31843b;
    }

    public final int b() {
        int[] iArr = this.f31844c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31842a;
    }
}
