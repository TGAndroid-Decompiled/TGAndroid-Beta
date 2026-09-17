package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26232a;
    public final boolean[] f26233b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26232a = i10;
        this.f26233b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26232a;
        boolean[] zArr = this.f26233b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = tn.f30624m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = zt.f33231b;
                    return;
                }
                return;
        }
    }
}
