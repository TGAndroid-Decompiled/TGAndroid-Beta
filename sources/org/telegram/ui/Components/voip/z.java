package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39664a;
    public final a0 f39665b;

    public z(a0 a0Var, int i7) {
        this.f39664a = i7;
        this.f39665b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39664a) {
            case 0:
                a0.a(this.f39665b);
                return;
            default:
                a0 a0Var = this.f39665b;
                if (a0Var.f39086y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
