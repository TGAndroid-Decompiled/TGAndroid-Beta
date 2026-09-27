package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24432a;
    public final boolean[] f24433b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24432a = i10;
        this.f24433b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24432a;
        boolean[] zArr = this.f24433b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = wn.f30075m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = du.f23730b;
                    return;
                }
                return;
        }
    }
}
