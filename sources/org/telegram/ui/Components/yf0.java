package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f33141a;
    public final dg0 f33142b;

    public yf0(dg0 dg0Var, int i10) {
        this.f33141a = i10;
        this.f33142b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33141a) {
            case 0:
                this.f33142b.e();
                return;
            default:
                this.f33142b.g();
                return;
        }
    }
}
