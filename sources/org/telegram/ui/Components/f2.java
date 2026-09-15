package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23780a;
    public final boolean[] f23781b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23780a = i10;
        this.f23781b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23780a;
        boolean[] zArr = this.f23781b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28432m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f22873b;
                    return;
                }
                return;
        }
    }
}
