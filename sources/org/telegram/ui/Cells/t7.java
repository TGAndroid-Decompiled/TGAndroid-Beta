package org.telegram.ui.Cells;

import org.telegram.messenger.r10;
public final class t7 {
    public int f31845a;
    public int f31846b;
    public int[] f31847c = null;
    public int d = 1;
    public r10 f31848e;

    public final int a() {
        int[] iArr = this.f31847c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31846b;
    }

    public final int b() {
        int[] iArr = this.f31847c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31845a;
    }
}
