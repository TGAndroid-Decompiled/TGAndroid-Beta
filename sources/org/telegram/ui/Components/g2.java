package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26511a;
    public final boolean[] f26512b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26511a = i10;
        this.f26512b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26511a;
        boolean[] zArr = this.f26512b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26384r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27449b;
                    return;
                }
                return;
        }
    }
}
