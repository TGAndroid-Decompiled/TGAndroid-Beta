package org.telegram.ui.Cells;

import org.telegram.messenger.s10;
public final class t7 {
    public int f31876a;
    public int f31877b;
    public int[] f31878c = null;
    public int d = 1;
    public s10 f31879e;

    public final int a() {
        int[] iArr = this.f31878c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31877b;
    }

    public final int b() {
        int[] iArr = this.f31878c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31876a;
    }
}
