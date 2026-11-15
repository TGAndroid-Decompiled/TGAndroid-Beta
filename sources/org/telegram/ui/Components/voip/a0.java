package org.telegram.ui.Components.voip;
public final class a0 implements Runnable {
    public final int f40487a;
    public final b0 f40488b;

    public a0(b0 b0Var, int i7) {
        this.f40487a = i7;
        this.f40488b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f40487a) {
            case 0:
                b0.a(this.f40488b);
                return;
            default:
                b0 b0Var = this.f40488b;
                if (b0Var.f40515y) {
                    b0Var.h();
                    b0Var.post(new a0(b0Var, 0));
                    return;
                }
                return;
        }
    }
}
