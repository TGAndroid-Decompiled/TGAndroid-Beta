package org.telegram.ui.Components;
public final class z80 implements Runnable {
    public final int f33097a;
    public final a90 f33098b;
    public final e90 f33099c;

    public z80(a90 a90Var, e90 e90Var, int i10) {
        this.f33097a = i10;
        this.f33098b = a90Var;
        this.f33099c = e90Var;
    }

    @Override
    public final void run() {
        switch (this.f33097a) {
            case 0:
                this.f33098b.k(this.f33099c, false);
                return;
            default:
                this.f33098b.k(this.f33099c, false);
                return;
        }
    }
}
