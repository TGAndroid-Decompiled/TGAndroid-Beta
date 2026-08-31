package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f27126a;
    public final c8 f27127b;

    public g7(c8 c8Var, int i10) {
        this.f27126a = i10;
        this.f27127b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f27126a) {
            case 0:
                c8.n(this.f27127b);
                return;
            default:
                c8.F(this.f27127b);
                return;
        }
    }
}
