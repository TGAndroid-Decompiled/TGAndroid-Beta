package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23571a;
    public int f23572b;
    public int[] f23573c = null;
    public int d = 1;
    public Utilities.Callback2Return f23574e;

    public final int a() {
        int[] iArr = this.f23573c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23572b;
    }

    public final int b() {
        int[] iArr = this.f23573c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23571a;
    }
}
