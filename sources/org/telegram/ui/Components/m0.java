package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f28231a;
    public final Runnable f28232b;

    public m0(int i10, Runnable runnable) {
        this.f28231a = i10;
        this.f28232b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f28231a) {
            case 0:
                Runnable runnable = this.f28232b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f28232b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable3 = this.f28232b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            default:
                this.f28232b.run();
                return;
        }
    }
}
