package org.telegram.ui.Components;
public final class wg0 implements Runnable {
    public final int f29666a;
    public final zg0 f29667b;

    public wg0(zg0 zg0Var, int i10) {
        this.f29666a = i10;
        this.f29667b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29666a) {
            case 0:
                this.f29667b.a(true);
                return;
            default:
                this.f29667b.d();
                return;
        }
    }
}
