package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class q2 implements DialogInterface.OnDismissListener {
    public final int f31803a = 0;
    public final boolean[] f31804b;
    public final Runnable f31805c;

    public q2(Runnable runnable, boolean[] zArr) {
        this.f31805c = runnable;
        this.f31804b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31803a) {
            case 0:
                Runnable runnable = this.f31805c;
                if (runnable != null && this.f31804b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f31804b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f31805c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q2(boolean[] zArr, Runnable runnable) {
        this.f31804b = zArr;
        this.f31805c = runnable;
    }
}
