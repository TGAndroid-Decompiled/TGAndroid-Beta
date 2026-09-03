package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f27110a;
    public final c8 f27111b;

    public g7(c8 c8Var, int i10) {
        this.f27110a = i10;
        this.f27111b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f27110a) {
            case 0:
                c8.n(this.f27111b);
                return;
            default:
                c8.F(this.f27111b);
                return;
        }
    }
}
