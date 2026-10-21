package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f28921a = 0;
    public final boolean[] f28922b;
    public final Runnable f28923c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f28923c = runnable;
        this.f28922b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28921a) {
            case 0:
                Runnable runnable = this.f28923c;
                if (runnable != null && this.f28922b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28922b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28923c;
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
        this.f28922b = zArr;
        this.f28923c = runnable;
    }
}
