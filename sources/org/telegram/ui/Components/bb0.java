package org.telegram.ui.Components;
public final class bb0 implements Runnable {
    public final int f33797a;
    public final cb0 f33798b;

    public bb0(cb0 cb0Var, int i7) {
        this.f33797a = i7;
        this.f33798b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33797a) {
            case 0:
                this.f33798b.y();
                return;
            default:
                this.f33798b.m(true);
                return;
        }
    }
}
