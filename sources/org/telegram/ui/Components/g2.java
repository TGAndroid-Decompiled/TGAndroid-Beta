package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26477a;
    public final boolean[] f26478b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26477a = i10;
        this.f26478b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26477a;
        boolean[] zArr = this.f26478b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26282m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27337b;
                    return;
                }
                return;
        }
    }
}
