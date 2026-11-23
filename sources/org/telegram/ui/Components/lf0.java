package org.telegram.ui.Components;
public final class lf0 implements Runnable {
    public final int f37179a;
    public final of0 f37180b;

    public lf0(of0 of0Var, int i7) {
        this.f37179a = i7;
        this.f37180b = of0Var;
    }

    @Override
    public final void run() {
        switch (this.f37179a) {
            case 0:
                this.f37180b.a(true);
                return;
            default:
                this.f37180b.d();
                return;
        }
    }
}
