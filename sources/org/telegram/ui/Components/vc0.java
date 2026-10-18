package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31247a;
    public final wc0 f31248b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31247a = i10;
        this.f31248b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31247a) {
            case 0:
                this.f31248b.y();
                return;
            default:
                this.f31248b.m(true);
                return;
        }
    }
}
