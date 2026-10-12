package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f26615a;
    public final boolean[] f26616b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26615a = i10;
        this.f26616b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26615a;
        boolean[] zArr = this.f26616b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = no.f28876m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = uu.f31262b;
                    return;
                }
                return;
        }
    }
}
