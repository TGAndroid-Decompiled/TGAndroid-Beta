package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26634a;
    public final boolean[] f26635b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26634a = i10;
        this.f26635b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26634a;
        boolean[] zArr = this.f26635b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = xn.f32912m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = eu.f26136b;
                    return;
                }
                return;
        }
    }
}
