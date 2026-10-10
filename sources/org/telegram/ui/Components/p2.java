package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f29657a = 0;
    public final boolean[] f29658b;
    public final Runnable f29659c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f29659c = runnable;
        this.f29658b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29657a) {
            case 0:
                Runnable runnable = this.f29659c;
                if (runnable != null && this.f29658b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f29658b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29659c;
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
        this.f29658b = zArr;
        this.f29659c = runnable;
    }
}
