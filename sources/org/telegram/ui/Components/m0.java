package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m0 implements DialogInterface.OnDismissListener {
    public final int f35806a;
    public final Runnable f35807b;

    public m0(int i7, Runnable runnable) {
        this.f35806a = i7;
        this.f35807b = runnable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35806a) {
            case 0:
                Runnable runnable = this.f35807b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f35807b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f35807b.run();
                return;
            default:
                Runnable runnable3 = this.f35807b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
