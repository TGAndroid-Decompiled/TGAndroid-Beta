package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26258a;
    public final boolean[] f26259b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26258a = i10;
        this.f26259b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26258a;
        boolean[] zArr = this.f26259b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = tn.f30650m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = zt.f33257b;
                    return;
                }
                return;
        }
    }
}
