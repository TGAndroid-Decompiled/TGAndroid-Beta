package org.telegram.ui.Components;
public final class z80 implements Runnable {
    public final int f33124a;
    public final a90 f33125b;
    public final e90 f33126c;

    public z80(a90 a90Var, e90 e90Var, int i10) {
        this.f33124a = i10;
        this.f33125b = a90Var;
        this.f33126c = e90Var;
    }

    @Override
    public final void run() {
        switch (this.f33124a) {
            case 0:
                this.f33125b.k(this.f33126c, false);
                return;
            default:
                this.f33125b.k(this.f33126c, false);
                return;
        }
    }
}
