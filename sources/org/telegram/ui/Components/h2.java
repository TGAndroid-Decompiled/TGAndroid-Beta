package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class h2 implements DialogInterface.OnDismissListener {
    public final int f35618a = 0;
    public final boolean[] f35619b;
    public final Runnable f35620c;

    public h2(Runnable runnable, boolean[] zArr) {
        this.f35620c = runnable;
        this.f35619b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35618a) {
            case 0:
                Runnable runnable = this.f35620c;
                if (runnable != null && this.f35619b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f35619b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f35620c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h2(boolean[] zArr, Runnable runnable) {
        this.f35619b = zArr;
        this.f35620c = runnable;
    }
}
