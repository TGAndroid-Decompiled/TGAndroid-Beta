package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f41504a;
    public final a0 f41505b;

    public z(a0 a0Var, int i7) {
        this.f41504a = i7;
        this.f41505b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f41504a) {
            case 0:
                a0.a(this.f41505b);
                return;
            default:
                a0 a0Var = this.f41505b;
                if (a0Var.f40896y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
