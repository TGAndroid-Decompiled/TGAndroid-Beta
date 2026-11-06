package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f32750a;
    public final boolean[] f32751b;

    public d2(int i7, Runnable runnable, boolean[] zArr) {
        this.f32750a = i7;
        this.f32751b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f32750a;
        boolean[] zArr = this.f32751b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = bn.f32170r1;
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
