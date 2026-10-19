package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31249a;
    public final wc0 f31250b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31249a = i10;
        this.f31250b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31249a) {
            case 0:
                this.f31250b.y();
                return;
            default:
                this.f31250b.m(true);
                return;
        }
    }
}
