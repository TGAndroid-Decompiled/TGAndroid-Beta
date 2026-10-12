package org.telegram.ui.Cells;
public final class l7 implements Runnable {
    public final int f21488a;
    public final n7 f21489b;

    public l7(n7 n7Var, int i10) {
        this.f21488a = i10;
        this.f21489b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f21488a) {
            case 0:
                n7 n7Var = this.f21489b;
                n7Var.post(new l7(n7Var, 1));
                return;
            default:
                n7 n7Var2 = this.f21489b;
                n7Var2.f21570b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                return;
        }
    }
}
