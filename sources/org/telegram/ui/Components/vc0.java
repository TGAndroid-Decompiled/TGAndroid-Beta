package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31221a;
    public final wc0 f31222b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31221a = i10;
        this.f31222b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31221a) {
            case 0:
                this.f31222b.y();
                return;
            default:
                this.f31222b.m(true);
                return;
        }
    }
}
