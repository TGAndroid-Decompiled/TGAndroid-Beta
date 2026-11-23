package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f37349a;
    public final boolean[] f37350b;

    public m2(int i7, Runnable runnable, boolean[] zArr) {
        this.f37349a = i7;
        this.f37350b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.f37349a;
        boolean[] zArr = this.f37350b;
        switch (i7) {
            case 0:
                if (zArr[0]) {
                    int i10 = qn.f38908s1;
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
