package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f23991a;
    public final boolean[] f23992b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23991a = i10;
        this.f23992b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23991a;
        boolean[] zArr = this.f23992b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = un.f28734m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = bu.f23076b;
                    return;
                }
                return;
        }
    }
}
