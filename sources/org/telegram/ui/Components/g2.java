package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24332a;
    public final boolean[] f24333b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24332a = i10;
        this.f24333b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24332a;
        boolean[] zArr = this.f24333b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = vn.f29183m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = cu.f23393b;
                    return;
                }
                return;
        }
    }
}
