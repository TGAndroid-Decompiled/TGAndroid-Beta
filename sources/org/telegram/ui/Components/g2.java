package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24407a;
    public final boolean[] f24408b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24407a = i10;
        this.f24408b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24407a;
        boolean[] zArr = this.f24408b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = xn.f30383m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = eu.f24047b;
                    return;
                }
                return;
        }
    }
}
