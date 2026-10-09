package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnDismissListener {
    public final int f29690a = 0;
    public final boolean[] f29691b;
    public final Runnable f29692c;

    public p2(Runnable runnable, boolean[] zArr) {
        this.f29692c = runnable;
        this.f29691b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29690a) {
            case 0:
                Runnable runnable = this.f29692c;
                if (runnable != null && this.f29691b[0]) {
                    runnable.run();
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f29691b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = this.f29692c;
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
        this.f29691b = zArr;
        this.f29692c = runnable;
    }
}
