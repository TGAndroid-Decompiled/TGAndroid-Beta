package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24399a;
    public final boolean[] f24400b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24399a = i10;
        this.f24400b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24399a;
        boolean[] zArr = this.f24400b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = wn.f30056m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = du.f23726b;
                    return;
                }
                return;
        }
    }
}
