package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f32746a;
    public final boolean[] f32747b;

    public d2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32746a = i7;
        this.f32747b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32746a;
        boolean[] zArr = this.f32747b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.f32176r1;
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
