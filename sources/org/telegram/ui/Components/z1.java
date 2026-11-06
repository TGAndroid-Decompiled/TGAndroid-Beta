package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class z1 implements DialogInterface.OnDismissListener {
    public final int f40830a = 0;
    public final boolean[] f40831b;
    public final Runnable f40832c;

    public z1(Runnable runnable, boolean[] zArr) {
        this.f40832c = runnable;
        this.f40831b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40830a) {
            case 0:
                Runnable runnable = this.f40832c;
                if (runnable != null && this.f40831b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f40831b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f40832c;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public z1(boolean[] zArr, Runnable runnable) {
        this.f40831b = zArr;
        this.f40832c = runnable;
    }
}
