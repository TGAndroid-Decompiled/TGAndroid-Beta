package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class qa0 implements Runnable {
    public final int f31875a;
    public final ra0 f31876b;

    public qa0(ra0 ra0Var, int i9) {
        this.f31875a = i9;
        this.f31876b = ra0Var;
    }

    @Override
    public final void run() {
        switch (this.f31875a) {
            case 0:
                ra0 ra0Var = this.f31876b;
                if (ra0Var.W != -1) {
                    NotificationCenter.getInstance(ra0Var.Y.V.f27462w).onAnimationFinish(ra0Var.W);
                    ra0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f31876b.Y.h();
                return;
            default:
                ra0 ra0Var2 = this.f31876b;
                if (ra0Var2.W != -1) {
                    NotificationCenter.getInstance(ra0Var2.Y.V.f27462w).onAnimationFinish(ra0Var2.W);
                    ra0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
