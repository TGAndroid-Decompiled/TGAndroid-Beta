package org.telegram.ui.Components;
public final class l90 implements Runnable {
    public final int f25977a;
    public final m90 f25978b;
    public final q90 f25979c;

    public l90(m90 m90Var, q90 q90Var, int i10) {
        this.f25977a = i10;
        this.f25978b = m90Var;
        this.f25979c = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f25977a) {
            case 0:
                this.f25978b.k(this.f25979c, false);
                return;
            default:
                this.f25978b.k(this.f25979c, false);
                return;
        }
    }
}
