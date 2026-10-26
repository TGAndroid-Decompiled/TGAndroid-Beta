package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class q2 implements DialogInterface.OnDismissListener {
    public final int f31805a = 0;
    public final boolean[] f31806b;
    public final Runnable f31807c;

    public q2(Runnable runnable, boolean[] zArr) {
        this.f31807c = runnable;
        this.f31806b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31805a) {
            case 0:
                Runnable runnable = this.f31807c;
                if (runnable != null && this.f31806b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f31806b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f31807c;
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
        this.f31806b = zArr;
        this.f31807c = runnable;
    }
}
