package org.telegram.ui.Cells;

import org.telegram.messenger.r10;
public final class t7 {
    public int f31873a;
    public int f31874b;
    public int[] f31875c = null;
    public int d = 1;
    public r10 f31876e;

    public final int a() {
        int[] iArr = this.f31875c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31874b;
    }

    public final int b() {
        int[] iArr = this.f31875c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31873a;
    }
}
