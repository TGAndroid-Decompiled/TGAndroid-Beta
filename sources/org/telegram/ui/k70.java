package org.telegram.ui;
public final class k70 implements Runnable {
    public final int f38428a;
    public final r70 f38429b;

    public k70(r70 r70Var, int i10) {
        this.f38428a = i10;
        this.f38429b = r70Var;
    }

    @Override
    public final void run() {
        switch (this.f38428a) {
            case 0:
                r70 r70Var = this.f38429b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                return;
            default:
                this.f38429b.Y();
                return;
        }
    }
}
