package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class bc0 implements Runnable {
    public final int f26822a;
    public final cc0 f26823b;

    public bc0(cc0 cc0Var, int i10) {
        this.f26822a = i10;
        this.f26823b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f26822a) {
            case 0:
                cc0 cc0Var = this.f26823b;
                if (cc0Var.W != -1) {
                    NotificationCenter.getInstance(cc0Var.Y.f28919c0.f30963w).onAnimationFinish(cc0Var.W);
                    cc0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f26823b.Y.i();
                return;
            default:
                cc0 cc0Var2 = this.f26823b;
                if (cc0Var2.W != -1) {
                    NotificationCenter.getInstance(cc0Var2.Y.f28919c0.f30963w).onAnimationFinish(cc0Var2.W);
                    cc0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
