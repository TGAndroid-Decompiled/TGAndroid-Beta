package org.telegram.ui.Components.voip;
public final class a0 implements Runnable {
    public final int f40484a;
    public final b0 f40485b;

    public a0(b0 b0Var, int i7) {
        this.f40484a = i7;
        this.f40485b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f40484a) {
            case 0:
                b0.a(this.f40485b);
                return;
            default:
                b0 b0Var = this.f40485b;
                if (b0Var.f40512y) {
                    b0Var.h();
                    b0Var.post(new a0(b0Var, 0));
                    return;
                }
                return;
        }
    }
}
