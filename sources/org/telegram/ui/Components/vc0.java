package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31240a;
    public final wc0 f31241b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31240a = i10;
        this.f31241b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31240a) {
            case 0:
                this.f31241b.y();
                return;
            default:
                this.f31241b.m(true);
                return;
        }
    }
}
