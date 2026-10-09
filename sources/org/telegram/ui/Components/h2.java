package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f26936a;
    public final boolean[] f26937b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26936a = i10;
        this.f26937b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26936a;
        boolean[] zArr = this.f26937b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = lo.f28494m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = ru.f30512b;
                    return;
                }
                return;
        }
    }
}
