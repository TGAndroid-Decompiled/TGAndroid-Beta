package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24862a;
    public final boolean[] f24863b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24862a = i10;
        this.f24863b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24862a;
        boolean[] zArr = this.f24863b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = io.f25663m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = nu.f27414b;
                    return;
                }
                return;
        }
    }
}
