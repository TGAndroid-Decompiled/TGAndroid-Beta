package org.telegram.ui.Components;
public final class l90 implements Runnable {
    public final int f25955a;
    public final m90 f25956b;
    public final q90 f25957c;

    public l90(m90 m90Var, q90 q90Var, int i10) {
        this.f25955a = i10;
        this.f25956b = m90Var;
        this.f25957c = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f25955a) {
            case 0:
                this.f25956b.k(this.f25957c, false);
                return;
            default:
                this.f25956b.k(this.f25957c, false);
                return;
        }
    }
}
