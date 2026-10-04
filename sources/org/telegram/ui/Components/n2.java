package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f28818a = 0;
    public final boolean[] f28819b;
    public final Runnable f28820c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f28820c = runnable;
        this.f28819b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28818a) {
            case 0:
                Runnable runnable = this.f28820c;
                if (runnable != null && this.f28819b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28819b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28820c;
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
        this.f28819b = zArr;
        this.f28820c = runnable;
    }
}
