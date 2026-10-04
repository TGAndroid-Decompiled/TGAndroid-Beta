package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23775a;
    public int f23776b;
    public int[] f23777c = null;
    public int d = 1;
    public Utilities.Callback2Return f23778e;

    public final int a() {
        int[] iArr = this.f23777c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23776b;
    }

    public final int b() {
        int[] iArr = this.f23777c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23775a;
    }
}
