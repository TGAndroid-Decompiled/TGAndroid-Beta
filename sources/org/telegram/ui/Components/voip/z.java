package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39753a;
    public final a0 f39754b;

    public z(a0 a0Var, int i7) {
        this.f39753a = i7;
        this.f39754b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39753a) {
            case 0:
                a0.a(this.f39754b);
                return;
            default:
                a0 a0Var = this.f39754b;
                if (a0Var.f39175y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
