package org.telegram.ui.Cells;

import org.telegram.messenger.q10;
public final class s7 {
    public int f31863a;
    public int f31864b;
    public int[] f31865c = null;
    public int d = 1;
    public q10 f31866e;

    public final int a() {
        int[] iArr = this.f31865c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31864b;
    }

    public final int b() {
        int[] iArr = this.f31865c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31863a;
    }
}
