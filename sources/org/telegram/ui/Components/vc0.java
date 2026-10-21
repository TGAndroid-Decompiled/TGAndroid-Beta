package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31218a;
    public final wc0 f31219b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31218a = i10;
        this.f31219b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31218a) {
            case 0:
                this.f31219b.y();
                return;
            default:
                this.f31219b.m(true);
                return;
        }
    }
}
