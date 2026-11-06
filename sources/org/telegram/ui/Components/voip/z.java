package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39608a;
    public final a0 f39609b;

    public z(a0 a0Var, int i7) {
        this.f39608a = i7;
        this.f39609b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39608a) {
            case 0:
                a0.a(this.f39609b);
                return;
            default:
                a0 a0Var = this.f39609b;
                if (a0Var.f39030y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
