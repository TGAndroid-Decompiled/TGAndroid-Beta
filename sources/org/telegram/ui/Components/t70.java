package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f38229a;
    public final n2.n0 f38230b;
    public final x70 f38231c;

    public t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.f38229a = i7;
        this.f38230b = n0Var;
        this.f38231c = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f38229a) {
            case 0:
                this.f38230b.m(this.f38231c, false);
                return;
            default:
                this.f38230b.m(this.f38231c, false);
                return;
        }
    }
}
