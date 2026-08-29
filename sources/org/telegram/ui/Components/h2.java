package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f29035a;
    public final boolean[] f29036b;

    public h2(int i10, Runnable runnable, boolean[] zArr) {
        this.f29035a = i10;
        this.f29036b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f29035a;
        boolean[] zArr = this.f29036b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = on.f31399i1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = st.f32718b;
                    return;
                }
                return;
        }
    }
}
