package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f26751a;
    public final boolean[] f26752b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26751a = i10;
        this.f26752b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26751a;
        boolean[] zArr = this.f26752b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = rn.f30813j1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = xt.f33172b;
                    return;
                }
                return;
        }
    }
}
