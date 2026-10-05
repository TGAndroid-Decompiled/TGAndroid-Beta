package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f28929a = 0;
    public final boolean[] f28930b;
    public final Runnable f28931c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f28931c = runnable;
        this.f28930b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28929a) {
            case 0:
                Runnable runnable = this.f28931c;
                if (runnable != null && this.f28930b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28930b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28931c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public n2(boolean[] zArr, Runnable runnable) {
        this.f28930b = zArr;
        this.f28931c = runnable;
    }
}
