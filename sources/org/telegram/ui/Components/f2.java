package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnDismissListener {
    public final int f26166a;
    public final boolean[] f26167b;

    public f2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26166a = i10;
        this.f26167b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26166a;
        boolean[] zArr = this.f26167b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = co.f25356r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = gu.f26790b;
                    return;
                }
                return;
        }
    }
}
