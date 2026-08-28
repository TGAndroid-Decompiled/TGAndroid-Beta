package org.telegram.ui;
public final class j70 implements Runnable {
    public final int f39391a;
    public final q70 f39392b;

    public j70(q70 q70Var, int i9) {
        this.f39391a = i9;
        this.f39392b = q70Var;
    }

    @Override
    public final void run() {
        switch (this.f39391a) {
            case 0:
                q70 q70Var = this.f39392b;
                q70Var.h.postOnAnimation(new j70(q70Var, 1));
                return;
            default:
                this.f39392b.X();
                return;
        }
    }
}
