package org.telegram.ui.Components.voip;
public final class z implements Runnable {
    public final int f41368a;
    public final a0 f41369b;

    public z(a0 a0Var, int i7) {
        this.f41368a = i7;
        this.f41369b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f41368a) {
            case 0:
                a0.a(this.f41369b);
                return;
            default:
                a0 a0Var = this.f41369b;
                if (a0Var.f40760y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    return;
                }
                return;
        }
    }
}
