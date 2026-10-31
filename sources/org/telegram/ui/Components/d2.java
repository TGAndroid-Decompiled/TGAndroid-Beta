package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f25261a;
    public final boolean[] f25262b;

    public d2(int i10, Runnable runnable, boolean[] zArr) {
        this.f25261a = i10;
        this.f25262b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25261a;
        boolean[] zArr = this.f25262b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = jn.f27409r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = mt.X1;
                    return;
                }
                return;
        }
    }
}
