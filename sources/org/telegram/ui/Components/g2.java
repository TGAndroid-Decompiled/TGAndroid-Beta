package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f24398a;
    public final boolean[] f24399b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24398a = i10;
        this.f24399b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24398a;
        boolean[] zArr = this.f24399b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = wn.f30055m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = du.f23725b;
                    return;
                }
                return;
        }
    }
}
