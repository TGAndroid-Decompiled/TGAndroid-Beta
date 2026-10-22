package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f28924a = 0;
    public final boolean[] f28925b;
    public final Runnable f28926c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f28926c = runnable;
        this.f28925b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28924a) {
            case 0:
                Runnable runnable = this.f28926c;
                if (runnable != null && this.f28925b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28925b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28926c;
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
        this.f28925b = zArr;
        this.f28926c = runnable;
    }
}
