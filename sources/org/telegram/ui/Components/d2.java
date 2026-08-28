package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d2 implements DialogInterface.OnDismissListener {
    public final int f27634a;
    public final boolean[] f27635b;

    public d2(int i9, Runnable runnable, boolean[] zArr) {
        this.f27634a = i9;
        this.f27635b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.f27634a;
        boolean[] zArr = this.f27635b;
        switch (i9) {
            case 0:
                if (zArr[0]) {
                    int i10 = jn.f29763i1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i11 = mt.f30918b;
                    return;
                }
                return;
        }
    }
}
