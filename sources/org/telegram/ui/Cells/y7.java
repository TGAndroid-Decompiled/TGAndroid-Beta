package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23542a;
    public int f23543b;
    public int[] f23544c = null;
    public int d = 1;
    public Utilities.Callback2Return f23545e;

    public final int a() {
        int[] iArr = this.f23544c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23543b;
    }

    public final int b() {
        int[] iArr = this.f23544c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23542a;
    }
}
