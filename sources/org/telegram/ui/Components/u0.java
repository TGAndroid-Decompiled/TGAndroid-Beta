package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnDismissListener {
    public final int f27531a;
    public final Runnable f27532b;

    public u0(int i10, Runnable runnable) {
        this.f27531a = i10;
        this.f27532b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27531a) {
            case 0:
                this.f27532b.run();
                return;
            case 1:
                Runnable runnable = this.f27532b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable2 = this.f27532b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                Runnable runnable3 = this.f27532b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
