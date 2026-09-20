package org.telegram.ui.Components;
public final class uf0 implements Runnable {
    public final int f28655a;
    public final yf0 f28656b;

    public uf0(yf0 yf0Var, int i10) {
        this.f28655a = i10;
        this.f28656b = yf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28655a) {
            case 0:
                this.f28656b.e();
                return;
            default:
                this.f28656b.g();
                return;
        }
    }
}
