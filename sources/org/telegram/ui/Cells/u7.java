package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class u7 {
    public int f25739a;
    public int f25740b;
    public int[] f25741c = null;
    public int d = 1;
    public Utilities.Callback2Return f25742e;

    public final int a() {
        int[] iArr = this.f25741c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f25740b;
    }

    public final int b() {
        int[] iArr = this.f25741c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f25739a;
    }
}
