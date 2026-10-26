package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class q0 implements DialogInterface.OnDismissListener {
    public final int f31752a;
    public final Runnable f31753b;

    public q0(int i10, Runnable runnable) {
        this.f31752a = i10;
        this.f31753b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31752a) {
            case 0:
                this.f31753b.run();
                return;
            case 1:
                Runnable runnable = this.f31753b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f31753b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f31753b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
