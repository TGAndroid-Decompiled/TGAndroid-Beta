package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f30655a;
    public final cg0 f30656b;

    public yf0(cg0 cg0Var, int i10) {
        this.f30655a = i10;
        this.f30656b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30655a) {
            case 0:
                this.f30656b.e();
                return;
            default:
                this.f30656b.g();
                return;
        }
    }
}
