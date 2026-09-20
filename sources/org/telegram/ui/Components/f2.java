package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23973a;
    public final boolean[] f23974b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23973a = i10;
        this.f23974b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23973a;
        boolean[] zArr = this.f23974b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28733m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f23051b;
                    return;
                }
                return;
        }
    }
}
