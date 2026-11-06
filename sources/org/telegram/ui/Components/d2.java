package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f32755a;
    public final boolean[] f32756b;

    public d2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32755a = i7;
        this.f32756b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32755a;
        boolean[] zArr = this.f32756b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.f32204r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = ys.X1;
                    return;
                }
                return;
        }
    }
}
