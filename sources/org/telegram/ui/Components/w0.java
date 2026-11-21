package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w0 implements DialogInterface.OnDismissListener {
    public final int f41607a;
    public final Runnable f41608b;

    public w0(int i7, Runnable runnable) {
        this.f41607a = i7;
        this.f41608b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41607a) {
            case 0:
                Runnable runnable = this.f41608b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f41608b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f41608b.run();
                return;
            default:
                Runnable runnable3 = this.f41608b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
