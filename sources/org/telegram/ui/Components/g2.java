package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f25165a;
    public final boolean[] f25166b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f25165a = i10;
        this.f25166b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25165a;
        boolean[] zArr = this.f25166b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = io.f26000m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = nu.f27715b;
                    return;
                }
                return;
        }
    }
}
