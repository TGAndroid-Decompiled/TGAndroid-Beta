package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f29451a;
    public final boolean[] f29452b;

    public j2(int i10, Runnable runnable, boolean[] zArr) {
        this.f29451a = i10;
        this.f29452b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f29451a;
        boolean[] zArr = this.f29452b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = go.f28611r1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = ju.f29721b;
                    return;
                }
                return;
        }
    }
}
