package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f37329a;
    public final boolean[] f37330b;

    public m2(int i7, Runnable runnable, boolean[] zArr) {
        this.f37329a = i7;
        this.f37330b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f37329a;
        boolean[] zArr = this.f37330b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = rn.f39206s1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = mt.d2;
                    return;
                }
                return;
        }
    }
}
