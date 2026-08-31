package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f23027a;
    public final l7 f23028b;

    public j7(l7 l7Var, int i10) {
        this.f23027a = i10;
        this.f23028b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f23027a) {
            case 0:
                l7 l7Var = this.f23028b;
                l7Var.post(new j7(l7Var, 1));
                return;
            default:
                l7 l7Var2 = this.f23028b;
                l7Var2.V.isSpoilersRevealed = true;
                l7Var2.E.clear();
                l7Var2.F.clear();
                l7Var2.G.clear();
                l7Var2.invalidate();
                return;
        }
    }
}
