package org.telegram.ui.Cells;
public final class i7 implements Runnable {
    public final int f21191a;
    public final k7 f21192b;

    public i7(k7 k7Var, int i10) {
        this.f21191a = i10;
        this.f21192b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f21191a) {
            case 0:
                k7 k7Var = this.f21192b;
                k7Var.post(new i7(k7Var, 1));
                return;
            default:
                k7 k7Var2 = this.f21192b;
                k7Var2.V.isSpoilersRevealed = true;
                k7Var2.E.clear();
                k7Var2.F.clear();
                k7Var2.G.clear();
                k7Var2.invalidate();
                return;
        }
    }
}
