package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26678a;
    public final boolean[] f26679b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26678a = i10;
        this.f26679b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26678a;
        boolean[] zArr = this.f26679b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = xn.f33003m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = eu.f26210b;
                    return;
                }
                return;
        }
    }
}
