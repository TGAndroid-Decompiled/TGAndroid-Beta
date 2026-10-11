package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23771a;
    public int f23772b;
    public int[] f23773c = null;
    public int d = 1;
    public Utilities.Callback2Return f23774e;

    public final int a() {
        int[] iArr = this.f23773c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23772b;
    }

    public final int b() {
        int[] iArr = this.f23773c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23771a;
    }
}
