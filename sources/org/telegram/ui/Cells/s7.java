package org.telegram.ui.Cells;

import org.telegram.messenger.r10;
public final class s7 {
    public int f31794a;
    public int f31795b;
    public int[] f31796c = null;
    public int d = 1;
    public r10 f31797e;

    public final int a() {
        int[] iArr = this.f31796c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31795b;
    }

    public final int b() {
        int[] iArr = this.f31796c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31794a;
    }
}
