package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g11 implements Runnable {
    public final int f24329a;
    public final Runnable f24330b;
    public final Runnable f24331c;

    public g11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24329a = i10;
        this.f24330b = runnable;
        this.f24331c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24329a) {
            case 0:
                k11.b(this.f24330b);
                Runnable runnable = this.f24331c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24330b.run();
                this.f24331c.run();
                return;
        }
    }
}
