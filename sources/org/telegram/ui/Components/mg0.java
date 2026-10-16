package org.telegram.ui.Components;
public final class mg0 implements Runnable {
    public final int f27102a;
    public final rg0 f27103b;

    public mg0(rg0 rg0Var, int i10) {
        this.f27102a = i10;
        this.f27103b = rg0Var;
    }

    @Override
    public final void run() {
        switch (this.f27102a) {
            case 0:
                this.f27103b.e();
                return;
            default:
                this.f27103b.g();
                return;
        }
    }
}
