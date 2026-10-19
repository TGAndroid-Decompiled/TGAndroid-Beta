package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26435a;
    public final boolean[] f26436b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26435a = i10;
        this.f26436b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26435a;
        boolean[] zArr = this.f26436b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26264m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27360b;
                    return;
                }
                return;
        }
    }
}
