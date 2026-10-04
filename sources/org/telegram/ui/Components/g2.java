package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26629a;
    public final boolean[] f26630b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26629a = i10;
        this.f26630b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26629a;
        boolean[] zArr = this.f26630b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = xn.f32906m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = eu.f26131b;
                    return;
                }
                return;
        }
    }
}
