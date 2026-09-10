package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f23492a;
    public final boolean[] f23493b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f23492a = i10;
        this.f23493b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f23492a;
        boolean[] zArr = this.f23493b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = zn.f29731m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = fu.f23082b;
                    return;
                }
                return;
        }
    }
}
