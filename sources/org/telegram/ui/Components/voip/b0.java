package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f39199a;
    public final d0 f39200b;

    public b0(d0 d0Var, int i7) {
        this.f39199a = i7;
        this.f39200b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f39199a) {
            case 0:
                d0.a(this.f39200b);
                return;
            default:
                d0.a(this.f39200b);
                return;
        }
    }
}
