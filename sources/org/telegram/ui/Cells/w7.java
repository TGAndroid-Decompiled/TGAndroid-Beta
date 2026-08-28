package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class w7 {
    public int f25907a;
    public int f25908b;
    public int[] f25909c = null;
    public int d = 1;
    public Utilities.Callback2Return f25910e;

    public final int a() {
        int[] iArr = this.f25909c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f25908b;
    }

    public final int b() {
        int[] iArr = this.f25909c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f25907a;
    }
}
