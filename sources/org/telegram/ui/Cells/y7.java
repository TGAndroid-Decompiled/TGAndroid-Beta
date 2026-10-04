package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23770a;
    public int f23771b;
    public int[] f23772c = null;
    public int d = 1;
    public Utilities.Callback2Return f23773e;

    public final int a() {
        int[] iArr = this.f23772c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23771b;
    }

    public final int b() {
        int[] iArr = this.f23772c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23770a;
    }
}
