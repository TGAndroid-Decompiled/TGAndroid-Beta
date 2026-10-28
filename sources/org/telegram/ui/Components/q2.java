package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class q2 implements DialogInterface.OnDismissListener {
    public final int f31770a = 0;
    public final boolean[] f31771b;
    public final Runnable f31772c;

    public q2(Runnable runnable, boolean[] zArr) {
        this.f31772c = runnable;
        this.f31771b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31770a) {
            case 0:
                Runnable runnable = this.f31772c;
                if (runnable != null && this.f31771b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f31771b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f31772c;
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
        this.f31771b = zArr;
        this.f31772c = runnable;
    }
}
