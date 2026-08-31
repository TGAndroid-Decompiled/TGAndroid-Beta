package org.telegram.ui.Components;
public final class c90 implements Runnable {
    public final int f25887a;
    public final d90 f25888b;
    public final h90 f25889c;

    public c90(d90 d90Var, h90 h90Var, int i10) {
        this.f25887a = i10;
        this.f25888b = d90Var;
        this.f25889c = h90Var;
    }

    @Override
    public final void run() {
        switch (this.f25887a) {
            case 0:
                this.f25888b.k(this.f25889c, false);
                return;
            default:
                this.f25888b.k(this.f25889c, false);
                return;
        }
    }
}
