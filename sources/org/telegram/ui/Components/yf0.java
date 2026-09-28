package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f30656a;
    public final cg0 f30657b;

    public yf0(cg0 cg0Var, int i10) {
        this.f30656a = i10;
        this.f30657b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30656a) {
            case 0:
                this.f30657b.e();
                return;
            default:
                this.f30657b.g();
                return;
        }
    }
}
