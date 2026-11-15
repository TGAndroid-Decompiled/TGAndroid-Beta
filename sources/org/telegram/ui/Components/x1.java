package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f41501a = 0;
    public final boolean[] f41502b;
    public final Runnable f41503c;

    public x1(Runnable runnable, boolean[] zArr) {
        this.f41503c = runnable;
        this.f41502b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41501a) {
            case 0:
                Runnable runnable = this.f41503c;
                if (runnable != null && this.f41502b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f41502b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f41503c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x1(boolean[] zArr, Runnable runnable) {
        this.f41502b = zArr;
        this.f41503c = runnable;
    }
}
