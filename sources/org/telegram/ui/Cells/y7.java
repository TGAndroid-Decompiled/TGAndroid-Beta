package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f21661a;
    public int f21662b;
    public int[] f21663c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21663c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21662b;
    }

    public final int b() {
        int[] iArr = this.f21663c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21661a;
    }
}
