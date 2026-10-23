package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f28925a = 0;
    public final boolean[] f28926b;
    public final Runnable f28927c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f28927c = runnable;
        this.f28926b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28925a) {
            case 0:
                Runnable runnable = this.f28927c;
                if (runnable != null && this.f28926b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28926b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28927c;
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
        this.f28926b = zArr;
        this.f28927c = runnable;
    }
}
