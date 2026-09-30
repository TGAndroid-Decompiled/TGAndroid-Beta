package org.telegram.ui.Components;
public final class l90 implements Runnable {
    public final int f25942a;
    public final m90 f25943b;
    public final q90 f25944c;

    public l90(m90 m90Var, q90 q90Var, int i10) {
        this.f25942a = i10;
        this.f25943b = m90Var;
        this.f25944c = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f25942a) {
            case 0:
                this.f25943b.k(this.f25944c, false);
                return;
            default:
                this.f25943b.k(this.f25944c, false);
                return;
        }
    }
}
