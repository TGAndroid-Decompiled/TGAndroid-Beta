package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x1 implements DialogInterface.OnDismissListener {
    public final int f41498a = 0;
    public final boolean[] f41499b;
    public final Runnable f41500c;

    public x1(Runnable runnable, boolean[] zArr) {
        this.f41500c = runnable;
        this.f41499b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41498a) {
            case 0:
                Runnable runnable = this.f41500c;
                if (runnable != null && this.f41499b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f41499b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f41500c;
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
        this.f41499b = zArr;
        this.f41500c = runnable;
    }
}
