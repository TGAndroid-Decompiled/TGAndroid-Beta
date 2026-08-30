package org.telegram.ui.Components;
public final class g7 implements Runnable {
    public final int f25066a;
    public final c8 f25067b;

    public g7(c8 c8Var, int i10) {
        this.f25066a = i10;
        this.f25067b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f25066a) {
            case 0:
                c8.n(this.f25067b);
                return;
            default:
                c8.F(this.f25067b);
                return;
        }
    }
}
