package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39611a;
    public final a0 f39612b;

    public z(a0 a0Var, int i7) {
        this.f39611a = i7;
        this.f39612b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39611a) {
            case 0:
                a0.a(this.f39612b);
                return;
            default:
                a0 a0Var = this.f39612b;
                if (a0Var.f39033y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
