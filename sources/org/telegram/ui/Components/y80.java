package org.telegram.ui.Components;
public final class y80 implements Runnable {
    public final int f30174a;
    public final z80 f30175b;
    public final d90 f30176c;

    public y80(z80 z80Var, d90 d90Var, int i10) {
        this.f30174a = i10;
        this.f30175b = z80Var;
        this.f30176c = d90Var;
    }

    @Override
    public final void run() {
        switch (this.f30174a) {
            case 0:
                this.f30175b.k(this.f30176c, false);
                return;
            default:
                this.f30175b.k(this.f30176c, false);
                return;
        }
    }
}
