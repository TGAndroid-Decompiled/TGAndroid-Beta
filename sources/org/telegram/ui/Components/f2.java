package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f24079a;
    public final boolean[] f24080b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24079a = i10;
        this.f24080b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24079a;
        boolean[] zArr = this.f24080b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28804m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f23094b;
                    return;
                }
                return;
        }
    }
}
