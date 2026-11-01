package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f25328a;
    public final boolean[] f25329b;

    public d2(int i10, Runnable runnable, boolean[] zArr) {
        this.f25328a = i10;
        this.f25329b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25328a;
        boolean[] zArr = this.f25329b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = jn.f27475r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = mt.X1;
                    return;
                }
                return;
        }
    }
}
