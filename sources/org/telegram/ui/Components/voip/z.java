package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39675a;
    public final a0 f39676b;

    public z(a0 a0Var, int i7) {
        this.f39675a = i7;
        this.f39676b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39675a) {
            case 0:
                a0.a(this.f39676b);
                return;
            default:
                a0 a0Var = this.f39676b;
                if (a0Var.f39095y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
