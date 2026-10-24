package org.telegram.ui.Components;
public final class vc0 implements Runnable {
    public final int f31417a;
    public final wc0 f31418b;

    public vc0(wc0 wc0Var, int i10) {
        this.f31417a = i10;
        this.f31418b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f31417a) {
            case 0:
                this.f31418b.y();
                return;
            default:
                this.f31418b.m(true);
                return;
        }
    }
}
