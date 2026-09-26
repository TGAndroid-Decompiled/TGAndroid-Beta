package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n2 implements DialogInterface.OnDismissListener {
    public final int f26650a = 0;
    public final boolean[] f26651b;
    public final Runnable f26652c;

    public n2(Runnable runnable, boolean[] zArr) {
        this.f26652c = runnable;
        this.f26651b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26650a) {
            case 0:
                Runnable runnable = this.f26652c;
                if (runnable != null && this.f26651b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f26651b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f26652c;
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
        this.f26651b = zArr;
        this.f26652c = runnable;
    }
}
