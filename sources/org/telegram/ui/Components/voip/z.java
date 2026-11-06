package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f39629a;
    public final a0 f39630b;

    public z(a0 a0Var, int i7) {
        this.f39629a = i7;
        this.f39630b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f39629a) {
            case 0:
                a0.a(this.f39630b);
                return;
            default:
                a0 a0Var = this.f39630b;
                if (a0Var.f39051y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
