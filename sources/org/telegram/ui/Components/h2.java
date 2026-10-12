package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f26611a;
    public final boolean[] f26612b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26611a = i10;
        this.f26612b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26611a;
        boolean[] zArr = this.f26612b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = no.f28872m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = uu.f31262b;
                    return;
                }
                return;
        }
    }
}
