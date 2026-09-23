package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24132a;
    public final boolean[] f24133b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24132a = i10;
        this.f24133b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24132a;
        boolean[] zArr = this.f24133b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = vn.f28774m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = cu.f23104b;
                    return;
                }
                return;
        }
    }
}
