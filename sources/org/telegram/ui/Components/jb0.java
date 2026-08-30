package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
public final class jb0 implements Runnable {
    public final int f25950a;
    public final kb0 f25951b;

    public jb0(kb0 kb0Var, int i10) {
        this.f25950a = i10;
        this.f25951b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f25950a) {
            case 0:
                kb0 kb0Var = this.f25951b;
                if (kb0Var.W != -1) {
                    NotificationCenter.getInstance(kb0Var.Y.W.f30292w).onAnimationFinish(kb0Var.W);
                    kb0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f25951b.Y.h();
                return;
            default:
                kb0 kb0Var2 = this.f25951b;
                if (kb0Var2.W != -1) {
                    NotificationCenter.getInstance(kb0Var2.Y.W.f30292w).onAnimationFinish(kb0Var2.W);
                    kb0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
