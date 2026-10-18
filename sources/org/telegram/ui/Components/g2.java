package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26446a;
    public final boolean[] f26447b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26446a = i10;
        this.f26447b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26446a;
        boolean[] zArr = this.f26447b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26277m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27351b;
                    return;
                }
                return;
        }
    }
}
