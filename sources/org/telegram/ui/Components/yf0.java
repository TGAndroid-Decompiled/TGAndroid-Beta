package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f33140a;
    public final dg0 f33141b;

    public yf0(dg0 dg0Var, int i10) {
        this.f33140a = i10;
        this.f33141b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33140a) {
            case 0:
                this.f33141b.e();
                return;
            default:
                this.f33141b.g();
                return;
        }
    }
}
