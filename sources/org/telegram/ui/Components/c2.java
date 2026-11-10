package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f32420a;
    public final boolean[] f32421b;

    public c2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32420a = i7;
        this.f32421b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32420a;
        boolean[] zArr = this.f32421b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = an.f31887r1;
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
