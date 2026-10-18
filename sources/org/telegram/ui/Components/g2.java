package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26453a;
    public final boolean[] f26454b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26453a = i10;
        this.f26454b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26453a;
        boolean[] zArr = this.f26454b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26284m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27358b;
                    return;
                }
                return;
        }
    }
}
