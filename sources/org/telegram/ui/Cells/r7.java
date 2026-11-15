package org.telegram.ui.Cells;

import org.telegram.messenger.t10;
public final class r7 {
    public int f31356a;
    public int f31357b;
    public int[] f31358c = null;
    public int d = 1;
    public t10 f31359e;

    public final int a() {
        int[] iArr = this.f31358c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f31357b;
    }

    public final int b() {
        int[] iArr = this.f31358c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f31356a;
    }
}
