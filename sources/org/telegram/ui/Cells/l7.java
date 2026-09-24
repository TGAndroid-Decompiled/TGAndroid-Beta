package org.telegram.ui.Cells;
public final class l7 implements Runnable {
    public final int f20599a;
    public final n7 f20600b;

    public l7(n7 n7Var, int i10) {
        this.f20599a = i10;
        this.f20600b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f20599a) {
            case 0:
                n7 n7Var = this.f20600b;
                n7Var.post(new l7(n7Var, 1));
                return;
            default:
                n7 n7Var2 = this.f20600b;
                n7Var2.f20688b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                return;
        }
    }
}
