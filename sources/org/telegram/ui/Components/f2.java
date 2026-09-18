package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23729a;
    public final boolean[] f23730b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23729a = i10;
        this.f23730b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23729a;
        boolean[] zArr = this.f23730b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28413m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f22806b;
                    return;
                }
                return;
        }
    }
}
