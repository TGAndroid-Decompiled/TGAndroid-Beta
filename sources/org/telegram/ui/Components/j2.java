package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f29480a;
    public final boolean[] f29481b;

    public j2(int i10, Runnable runnable, boolean[] zArr) {
        this.f29480a = i10;
        this.f29481b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f29480a;
        boolean[] zArr = this.f29481b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = go.f28660r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = ju.f29768b;
                    return;
                }
                return;
        }
    }
}
