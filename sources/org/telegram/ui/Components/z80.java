package org.telegram.ui.Components;
public final class z80 implements Runnable {
    public final int f30542a;
    public final a90 f30543b;
    public final e90 f30544c;

    public z80(a90 a90Var, e90 e90Var, int i10) {
        this.f30542a = i10;
        this.f30543b = a90Var;
        this.f30544c = e90Var;
    }

    @Override
    public final void run() {
        switch (this.f30542a) {
            case 0:
                this.f30543b.k(this.f30544c, false);
                return;
            default:
                this.f30543b.k(this.f30544c, false);
                return;
        }
    }
}
