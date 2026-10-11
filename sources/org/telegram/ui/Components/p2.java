package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f29583a = 0;
    public final boolean[] f29584b;
    public final Runnable f29585c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f29585c = runnable;
        this.f29584b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29583a) {
            case 0:
                Runnable runnable = this.f29585c;
                if (runnable != null && this.f29584b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f29584b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29585c;
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
        this.f29584b = zArr;
        this.f29585c = runnable;
    }
}
