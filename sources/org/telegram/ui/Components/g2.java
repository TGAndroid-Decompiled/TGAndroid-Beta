package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26259a;
    public final boolean[] f26260b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26259a = i10;
        this.f26260b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26259a;
        boolean[] zArr = this.f26260b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = tn.f30651m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = zt.f33258b;
                    return;
                }
                return;
        }
    }
}
