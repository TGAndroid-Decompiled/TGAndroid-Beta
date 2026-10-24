package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class dc0 implements Runnable {
    public final int f25695a;
    public final ec0 f25696b;

    public dc0(ec0 ec0Var, int i10) {
        this.f25695a = i10;
        this.f25696b = ec0Var;
    }

    @Override
    public final void run() {
        switch (this.f25695a) {
            case 0:
                ec0 ec0Var = this.f25696b;
                if (ec0Var.W != -1) {
                    NotificationCenter.getInstance(ec0Var.Y.f27674c0.f29544w).onAnimationFinish(ec0Var.W);
                    ec0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25696b.Y.i();
                return;
            default:
                ec0 ec0Var2 = this.f25696b;
                if (ec0Var2.W != -1) {
                    NotificationCenter.getInstance(ec0Var2.Y.f27674c0.f29544w).onAnimationFinish(ec0Var2.W);
                    ec0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
