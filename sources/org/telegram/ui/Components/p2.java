package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f27829a = 0;
    public final boolean[] f27830b;
    public final Runnable f27831c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f27831c = runnable;
        this.f27830b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27829a) {
            case 0:
                Runnable runnable = this.f27831c;
                if (runnable != null && this.f27830b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f27830b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f27831c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public p2(boolean[] zArr, Runnable runnable) {
        this.f27830b = zArr;
        this.f27831c = runnable;
    }
}
