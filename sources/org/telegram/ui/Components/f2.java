package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f26724a;
    public final boolean[] f26725b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26724a = i10;
        this.f26725b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26724a;
        boolean[] zArr = this.f26725b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = sn.f31093j1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = xt.f33180b;
                    return;
                }
                return;
        }
    }
}
