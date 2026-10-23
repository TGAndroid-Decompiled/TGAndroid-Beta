package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnDismissListener {
    public final int f26481a;
    public final boolean[] f26482b;

    public g2(int i10, Runnable runnable, boolean[] zArr) {
        this.f26481a = i10;
        this.f26482b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f26481a;
        boolean[] zArr = this.f26482b;
        switch (i10) {
            case 0:
                if (zArr[0]) {
                    int i11 = fo.f26286m1;
                    return;
                }
                return;
            default:
                if (zArr[0]) {
                    int i12 = iu.f27341b;
                    return;
                }
                return;
        }
    }
}
