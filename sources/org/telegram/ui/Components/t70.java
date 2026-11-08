package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f38287a;
    public final n2.n0 f38288b;
    public final x70 f38289c;

    public t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.f38287a = i7;
        this.f38288b = n0Var;
        this.f38289c = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f38287a) {
            case 0:
                this.f38288b.m(this.f38289c, false);
                return;
            default:
                this.f38288b.m(this.f38289c, false);
                return;
        }
    }
}
