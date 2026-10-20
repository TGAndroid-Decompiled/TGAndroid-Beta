package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnDismissListener {
    public final int f28920a = 0;
    public final boolean[] f28921b;
    public final Runnable f28922c;

    public o2(Runnable runnable, boolean[] zArr) {
        this.f28922c = runnable;
        this.f28921b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28920a) {
            case 0:
                Runnable runnable = this.f28922c;
                if (runnable != null && this.f28921b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f28921b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f28922c;
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
        this.f28921b = zArr;
        this.f28922c = runnable;
    }
}
