package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f25639a = 0;
    public final boolean[] f25640b;
    public final Runnable f25641c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f25641c = runnable;
        this.f25640b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25639a) {
            case 0:
                Runnable runnable = this.f25641c;
                if (runnable != null && this.f25640b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f25640b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f25641c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public o2(boolean[] zArr, Runnable runnable) {
        this.f25640b = zArr;
        this.f25641c = runnable;
    }
}
