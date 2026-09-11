package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23570a;
    public int f23571b;
    public int[] f23572c = null;
    public int d = 1;
    public Utilities.Callback2Return f23573e;

    public final int a() {
        int[] iArr = this.f23572c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23571b;
    }

    public final int b() {
        int[] iArr = this.f23572c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23570a;
    }
}
