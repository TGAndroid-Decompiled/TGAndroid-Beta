package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f37746a;
    public final boolean[] f37747b;

    public n2(int i7, Runnable runnable, boolean[] zArr) {
        this.f37746a = i7;
        this.f37747b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f37746a;
        boolean[] zArr = this.f37747b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = tn.f39955s1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = ot.d2;
                    return;
                }
                return;
        }
    }
}
