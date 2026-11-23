package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f41466a;
    public final a0 f41467b;

    public z(a0 a0Var, int i7) {
        this.f41466a = i7;
        this.f41467b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f41466a) {
            case 0:
                a0.a(this.f41467b);
                return;
            default:
                a0 a0Var = this.f41467b;
                if (a0Var.f40858y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
