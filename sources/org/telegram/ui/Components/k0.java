package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class k0 implements DialogInterface.OnDismissListener {
    public final int f35220a;
    public final Runnable f35221b;

    public k0(int i3, Runnable runnable) {
        this.f35220a = i3;
        this.f35221b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35220a) {
            case 0:
                Runnable runnable = this.f35221b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35221b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                Runnable runnable3 = this.f35221b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            default:
                this.f35221b.run();
                return;
        }
    }
}
