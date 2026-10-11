package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f26886a;
    public final boolean[] f26887b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26886a = i10;
        this.f26887b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26886a;
        boolean[] zArr = this.f26887b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = lo.f28372m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = su.f30864b;
                    return;
                }
                return;
        }
    }
}
