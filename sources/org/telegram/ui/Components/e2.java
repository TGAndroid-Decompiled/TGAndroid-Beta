package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class e2 implements DialogInterface.OnDismissListener {

    public final int f27929a;

    public final boolean[] f27930b;

    public e2(int i10, Runnable runnable, boolean[] zArr) {
        this.f27929a = i10;
        this.f27930b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f27929a;
        boolean[] zArr = this.f27930b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = in.f29409i1;
                }
                break;
            default:
                if (zArr[0]) {
                    int i12 = lt.f30461b;
                }
                break;
        }
    }
}
