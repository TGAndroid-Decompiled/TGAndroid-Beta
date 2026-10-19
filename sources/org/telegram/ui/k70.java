package org.telegram.ui;
public final class k70 implements Runnable {
    public final int f38427a;
    public final r70 f38428b;

    public k70(r70 r70Var, int i10) {
        this.f38427a = i10;
        this.f38428b = r70Var;
    }

    @Override
    public final void run() {
        switch (this.f38427a) {
            case 0:
                r70 r70Var = this.f38428b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                return;
            default:
                this.f38428b.Y();
                return;
        }
    }
}
