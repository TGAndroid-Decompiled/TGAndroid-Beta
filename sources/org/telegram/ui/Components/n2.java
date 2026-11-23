package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f37751a;
    public final boolean[] f37752b;

    public n2(int i7, Runnable runnable, boolean[] zArr) {
        this.f37751a = i7;
        this.f37752b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f37751a;
        boolean[] zArr = this.f37752b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = tn.f39948s1;
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
