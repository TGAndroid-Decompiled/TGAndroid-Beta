package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31222a;
    public final wc0 f31223b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31222a = i10;
        this.f31223b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31222a) {
            case 0:
                this.f31223b.y();
                return;
            default:
                this.f31223b.m(true);
                return;
        }
    }
}
