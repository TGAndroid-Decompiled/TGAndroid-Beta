package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f21673a;
    public int f21674b;
    public int[] f21675c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21675c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21674b;
    }

    public final int b() {
        int[] iArr = this.f21675c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21673a;
    }
}
