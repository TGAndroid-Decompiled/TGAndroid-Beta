package org.telegram.ui;
public final class k70 implements Runnable {
    public final int f38435a;
    public final r70 f38436b;

    public k70(r70 r70Var, int i10) {
        this.f38435a = i10;
        this.f38436b = r70Var;
    }

    @Override
    public final void run() {
        switch (this.f38435a) {
            case 0:
                r70 r70Var = this.f38436b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                return;
            default:
                this.f38436b.Y();
                return;
        }
    }
}
