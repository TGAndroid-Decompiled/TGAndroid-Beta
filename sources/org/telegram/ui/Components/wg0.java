package org.telegram.ui.Components;
public final class wg0 implements Runnable {
    public final int f29669a;
    public final zg0 f29670b;

    public wg0(zg0 zg0Var, int i10) {
        this.f29669a = i10;
        this.f29670b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29669a) {
            case 0:
                this.f29670b.a(true);
                return;
            default:
                this.f29670b.d();
                return;
        }
    }
}
