package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class x7 {
    public int f23953a;
    public int f23954b;
    public int[] f23955c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f23955c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23954b;
    }

    public final int b() {
        int[] iArr = this.f23955c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23953a;
    }
}
