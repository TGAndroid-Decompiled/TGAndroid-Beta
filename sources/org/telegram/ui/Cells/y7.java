package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23778a;
    public int f23779b;
    public int[] f23780c = null;
    public int d = 1;
    public Utilities.Callback2Return f23781e;

    public final int a() {
        int[] iArr = this.f23780c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23779b;
    }

    public final int b() {
        int[] iArr = this.f23780c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23778a;
    }
}
