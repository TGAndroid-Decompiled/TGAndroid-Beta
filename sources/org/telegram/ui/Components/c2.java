package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f33470a;
    public final boolean[] f33471b;

    public c2(int i7, Runnable runnable, boolean[] zArr) {
        this.f33470a = i7;
        this.f33471b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f33470a;
        boolean[] zArr = this.f33471b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = jn.f36061s1;
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
