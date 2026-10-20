package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31217a;
    public final wc0 f31218b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31217a = i10;
        this.f31218b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31217a) {
            case 0:
                this.f31218b.y();
                return;
            default:
                this.f31218b.m(true);
                return;
        }
    }
}
