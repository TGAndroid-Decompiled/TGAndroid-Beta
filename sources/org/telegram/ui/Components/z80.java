package org.telegram.ui.Components;
public final class z80 implements Runnable {
    public final int f33098a;
    public final a90 f33099b;
    public final e90 f33100c;

    public z80(a90 a90Var, e90 e90Var, int i10) {
        this.f33098a = i10;
        this.f33099b = a90Var;
        this.f33100c = e90Var;
    }

    @Override
    public final void run() {
        switch (this.f33098a) {
            case 0:
                this.f33099b.k(this.f33100c, false);
                return;
            default:
                this.f33099b.k(this.f33100c, false);
                return;
        }
    }
}
