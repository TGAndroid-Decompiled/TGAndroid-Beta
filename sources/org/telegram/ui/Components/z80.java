package org.telegram.ui.Components;
public final class z80 implements Runnable {
    public final int f33125a;
    public final a90 f33126b;
    public final e90 f33127c;

    public z80(a90 a90Var, e90 e90Var, int i10) {
        this.f33125a = i10;
        this.f33126b = a90Var;
        this.f33127c = e90Var;
    }

    @Override
    public final void run() {
        switch (this.f33125a) {
            case 0:
                this.f33126b.k(this.f33127c, false);
                return;
            default:
                this.f33126b.k(this.f33127c, false);
                return;
        }
    }
}
