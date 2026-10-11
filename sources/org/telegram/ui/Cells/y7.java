package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23807a;
    public int f23808b;
    public int[] f23809c = null;
    public int d = 1;
    public Utilities.Callback2Return f23810e;

    public final int a() {
        int[] iArr = this.f23809c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23808b;
    }

    public final int b() {
        int[] iArr = this.f23809c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23807a;
    }
}
