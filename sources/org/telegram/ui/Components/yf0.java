package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f33147a;
    public final dg0 f33148b;

    public yf0(dg0 dg0Var, int i10) {
        this.f33147a = i10;
        this.f33148b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33147a) {
            case 0:
                this.f33148b.e();
                return;
            default:
                this.f33148b.g();
                return;
        }
    }
}
