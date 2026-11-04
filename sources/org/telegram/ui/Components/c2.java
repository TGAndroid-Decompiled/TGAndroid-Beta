package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c2 implements DialogInterface.OnDismissListener {
    public final int f32504a;
    public final boolean[] f32505b;

    public c2(int i3, Runnable runnable, boolean[] zArr) {
        this.f32504a = i3;
        this.f32505b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.f32504a;
        boolean[] zArr = this.f32505b;
        switch (i3) {
            case 0:
                if (zArr[0]) {
                    int i10 = an.f31903s1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int[] iArr = xs.Y1;
                    return;
                }
                return;
        }
    }
}
