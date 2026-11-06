package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f38270a;
    public final n2.n0 f38271b;
    public final x70 f38272c;

    public t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.f38270a = i7;
        this.f38271b = n0Var;
        this.f38272c = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f38270a) {
            case 0:
                this.f38271b.m(this.f38272c, false);
                return;
            default:
                this.f38271b.m(this.f38272c, false);
                return;
        }
    }
}
