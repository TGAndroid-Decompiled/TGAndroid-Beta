package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f30651a;
    public final cg0 f30652b;

    public yf0(cg0 cg0Var, int i10) {
        this.f30651a = i10;
        this.f30652b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30651a) {
            case 0:
                this.f30652b.e();
                return;
            default:
                this.f30652b.g();
                return;
        }
    }
}
