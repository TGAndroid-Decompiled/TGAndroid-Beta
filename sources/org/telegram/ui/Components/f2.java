package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23726a;
    public final boolean[] f23727b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23726a = i10;
        this.f23727b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23726a;
        boolean[] zArr = this.f23727b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28410m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f22803b;
                    return;
                }
                return;
        }
    }
}
