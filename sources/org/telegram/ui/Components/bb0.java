package org.telegram.ui.Components;
public final class bb0 implements Runnable {
    public final int f33827a;
    public final cb0 f33828b;

    public bb0(cb0 cb0Var, int i7) {
        this.f33827a = i7;
        this.f33828b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f33827a) {
            case 0:
                this.f33828b.y();
                return;
            default:
                this.f33828b.m(true);
                return;
        }
    }
}
