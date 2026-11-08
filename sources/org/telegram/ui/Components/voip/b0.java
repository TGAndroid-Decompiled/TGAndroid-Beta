package org.telegram.ui.Components.voip;
public final class b0 implements Runnable {
    public final int f39110a;
    public final d0 f39111b;

    public b0(d0 d0Var, int i7) {
        this.f39110a = i7;
        this.f39111b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f39110a) {
            case 0:
                d0.a(this.f39111b);
                return;
            default:
                d0.a(this.f39111b);
                return;
        }
    }
}
