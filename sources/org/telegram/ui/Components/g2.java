package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24315a;
    public final boolean[] f24316b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24315a = i10;
        this.f24316b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24315a;
        boolean[] zArr = this.f24316b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = vn.f29174m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = cu.f23383b;
                    return;
                }
                return;
        }
    }
}
