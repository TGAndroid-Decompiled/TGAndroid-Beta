package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class i2 implements DialogInterface.OnDismissListener {
    public final int f36121a = 0;
    public final boolean[] f36122b;
    public final Runnable f36123c;

    public i2(Runnable runnable, boolean[] zArr) {
        this.f36123c = runnable;
        this.f36122b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36121a) {
            case 0:
                Runnable runnable = this.f36123c;
                if (runnable != null && this.f36122b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f36122b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f36123c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i2(boolean[] zArr, Runnable runnable) {
        this.f36122b = zArr;
        this.f36123c = runnable;
    }
}
