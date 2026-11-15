package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f33467a;
    public final boolean[] f33468b;

    public c2(int i7, Runnable runnable, boolean[] zArr) {
        this.f33467a = i7;
        this.f33468b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f33467a;
        boolean[] zArr = this.f33468b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = jn.f36071s1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = ft.d2;
                    return;
                }
                return;
        }
    }
}
