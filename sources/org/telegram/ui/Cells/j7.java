package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f24574a;
    public final l7 f24575b;

    public j7(l7 l7Var, int i9) {
        this.f24574a = i9;
        this.f24575b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f24574a) {
            case 0:
                l7 l7Var = this.f24575b;
                l7Var.post(new j7(l7Var, 1));
                return;
            default:
                l7 l7Var2 = this.f24575b;
                l7Var2.U.isSpoilersRevealed = true;
                l7Var2.D.clear();
                l7Var2.E.clear();
                l7Var2.F.clear();
                l7Var2.invalidate();
                return;
        }
    }
}
