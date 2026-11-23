package org.telegram.ui.Components;
public final class lf0 implements Runnable {
    public final int f37135a;
    public final of0 f37136b;

    public lf0(of0 of0Var, int i7) {
        this.f37135a = i7;
        this.f37136b = of0Var;
    }

    @Override
    public final void run() {
        switch (this.f37135a) {
            case 0:
                this.f37136b.a(true);
                return;
            default:
                this.f37136b.d();
                return;
        }
    }
}
