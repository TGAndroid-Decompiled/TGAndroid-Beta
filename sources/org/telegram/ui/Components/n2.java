package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f30823a = 0;
    public final boolean[] f30824b;
    public final Runnable f30825c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f30825c = runnable;
        this.f30824b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30823a) {
            case 0:
                Runnable runnable = this.f30825c;
                if (runnable != null && this.f30824b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f30824b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f30825c;
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
        this.f30824b = zArr;
        this.f30825c = runnable;
    }
}
