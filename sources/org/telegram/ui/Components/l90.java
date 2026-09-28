package org.telegram.ui.Components;
public final class l90 implements Runnable {
    public final int f25954a;
    public final m90 f25955b;
    public final q90 f25956c;

    public l90(m90 m90Var, q90 q90Var, int i10) {
        this.f25954a = i10;
        this.f25955b = m90Var;
        this.f25956c = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f25954a) {
            case 0:
                this.f25955b.k(this.f25956c, false);
                return;
            default:
                this.f25955b.k(this.f25956c, false);
                return;
        }
    }
}
