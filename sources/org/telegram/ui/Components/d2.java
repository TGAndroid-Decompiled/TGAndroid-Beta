package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f32829a;
    public final boolean[] f32830b;

    public d2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32829a = i7;
        this.f32830b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32829a;
        boolean[] zArr = this.f32830b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.f32284r1;
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
