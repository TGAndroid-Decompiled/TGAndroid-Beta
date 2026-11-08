package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f32763a;
    public final boolean[] f32764b;

    public d2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32763a = i7;
        this.f32764b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32763a;
        boolean[] zArr = this.f32764b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.f32225r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = zs.X1;
                    return;
                }
                return;
        }
    }
}
