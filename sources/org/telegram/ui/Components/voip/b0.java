package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f39057a;
    public final d0 f39058b;

    public b0(d0 d0Var, int i7) {
        this.f39057a = i7;
        this.f39058b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f39057a) {
            case 0:
                d0.a(this.f39058b);
                return;
            default:
                d0.a(this.f39058b);
                return;
        }
    }
}
