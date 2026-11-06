package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f38259a;
    public final n2.n0 f38260b;
    public final x70 f38261c;

    public t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.f38259a = i7;
        this.f38260b = n0Var;
        this.f38261c = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f38259a) {
            case 0:
                this.f38260b.m(this.f38261c, false);
                return;
            default:
                this.f38260b.m(this.f38261c, false);
                return;
        }
    }
}
