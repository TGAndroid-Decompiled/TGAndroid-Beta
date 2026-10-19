package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31251a;
    public final wc0 f31252b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31251a = i10;
        this.f31252b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31251a) {
            case 0:
                this.f31252b.y();
                return;
            default:
                this.f31252b.m(true);
                return;
        }
    }
}
