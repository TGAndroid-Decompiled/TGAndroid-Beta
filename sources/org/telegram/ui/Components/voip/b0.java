package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f39119a;
    public final d0 f39120b;

    public b0(d0 d0Var, int i7) {
        this.f39119a = i7;
        this.f39120b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f39119a) {
            case 0:
                d0.a(this.f39120b);
                return;
            default:
                d0.a(this.f39120b);
                return;
        }
    }
}
