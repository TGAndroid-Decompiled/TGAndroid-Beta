package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f26938a;
    public final boolean[] f26939b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26938a = i10;
        this.f26939b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26938a;
        boolean[] zArr = this.f26939b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = lo.f28509m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = su.f30944b;
                    return;
                }
                return;
        }
    }
}
