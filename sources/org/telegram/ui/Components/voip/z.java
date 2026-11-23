package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f41505a;
    public final a0 f41506b;

    public z(a0 a0Var, int i7) {
        this.f41505a = i7;
        this.f41506b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f41505a) {
            case 0:
                a0.a(this.f41506b);
                return;
            default:
                a0 a0Var = this.f41506b;
                if (a0Var.f40897y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
