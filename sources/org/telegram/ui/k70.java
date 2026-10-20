package org.telegram.ui;
public final class k70 implements Runnable {
    public final int f38434a;
    public final r70 f38435b;

    public k70(r70 r70Var, int i10) {
        this.f38434a = i10;
        this.f38435b = r70Var;
    }

    @Override
    public final void run() {
        switch (this.f38434a) {
            case 0:
                r70 r70Var = this.f38435b;
                r70Var.h.postOnAnimation(new k70(r70Var, 1));
                return;
            default:
                this.f38435b.Y();
                return;
        }
    }
}
