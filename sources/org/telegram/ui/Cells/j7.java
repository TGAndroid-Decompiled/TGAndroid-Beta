package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f21265a;
    public final l7 f21266b;

    public j7(l7 l7Var, int i10) {
        this.f21265a = i10;
        this.f21266b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f21265a) {
            case 0:
                l7 l7Var = this.f21266b;
                l7Var.post(new j7(l7Var, 1));
                return;
            default:
                l7 l7Var2 = this.f21266b;
                l7Var2.V.isSpoilersRevealed = true;
                l7Var2.E.clear();
                l7Var2.F.clear();
                l7Var2.G.clear();
                l7Var2.invalidate();
                return;
        }
    }
}
