package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23779a;
    public final boolean[] f23780b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23779a = i10;
        this.f23780b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23779a;
        boolean[] zArr = this.f23780b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28429m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f22871b;
                    return;
                }
                return;
        }
    }
}
