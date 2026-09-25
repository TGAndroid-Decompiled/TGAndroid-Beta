package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24333a;
    public final boolean[] f24334b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24333a = i10;
        this.f24334b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24333a;
        boolean[] zArr = this.f24334b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = vn.f29184m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = cu.f23394b;
                    return;
                }
                return;
        }
    }
}
