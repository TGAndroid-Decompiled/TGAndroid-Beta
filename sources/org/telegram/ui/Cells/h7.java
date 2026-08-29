package org.telegram.ui.Cells;
public final class h7 implements Runnable {
    public final int f24461a;
    public final j7 f24462b;

    public h7(j7 j7Var, int i10) {
        this.f24461a = i10;
        this.f24462b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f24461a) {
            case 0:
                j7 j7Var = this.f24462b;
                j7Var.post(new h7(j7Var, 1));
                return;
            default:
                j7 j7Var2 = this.f24462b;
                j7Var2.U.isSpoilersRevealed = true;
                j7Var2.D.clear();
                j7Var2.E.clear();
                j7Var2.F.clear();
                j7Var2.invalidate();
                return;
        }
    }
}
