package org.telegram.ui;
public final class k70 implements Runnable {
    public final int f38439a;
    public final r70 f38440b;

    public k70(r70 r70Var, int i10) {
        this.f38439a = i10;
        this.f38440b = r70Var;
    }

    @Override
    public final void run() {
        switch (this.f38439a) {
            case 0:
                r70 r70Var = this.f38440b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                return;
            default:
                this.f38440b.Y();
                return;
        }
    }
}
