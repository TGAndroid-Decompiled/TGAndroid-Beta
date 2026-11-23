package org.telegram.ui.Components.voip;
public final class a0 implements Runnable {
    public final int f40763a;
    public final b0 f40764b;

    public a0(b0 b0Var, int i7) {
        this.f40763a = i7;
        this.f40764b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f40763a) {
            case 0:
                b0.a(this.f40764b);
                return;
            default:
                b0 b0Var = this.f40764b;
                if (b0Var.f40791y) {
                    b0Var.h();
                    b0Var.post(new a0(b0Var, 0));
                    return;
                }
                return;
        }
    }
}
