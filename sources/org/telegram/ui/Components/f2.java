package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f24772a;
    public final boolean[] f24773b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f24772a = i10;
        this.f24773b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24772a;
        boolean[] zArr = this.f24773b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = pn.f27931j1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = ut.f29295b;
                    return;
                }
                return;
        }
    }
}
