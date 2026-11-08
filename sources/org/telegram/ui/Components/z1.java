package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class z1 implements DialogInterface.OnDismissListener {
    public final int f40849a = 0;
    public final boolean[] f40850b;
    public final Runnable f40851c;

    public z1(Runnable runnable, boolean[] zArr) {
        this.f40851c = runnable;
        this.f40850b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40849a) {
            case 0:
                Runnable runnable = this.f40851c;
                if (runnable != null && this.f40850b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f40850b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f40851c;
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
        this.f40850b = zArr;
        this.f40851c = runnable;
    }
}
