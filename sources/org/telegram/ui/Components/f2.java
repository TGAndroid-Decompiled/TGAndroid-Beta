package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f24751a;
    public final boolean[] f24752b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24751a = i10;
        this.f24752b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24751a;
        boolean[] zArr = this.f24752b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = qn.f28159j1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = vt.f30084b;
                    return;
                }
                return;
        }
    }
}
