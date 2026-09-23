package org.telegram.ui.Cells;
public final class k7 implements Runnable {
    public final int f20336a;
    public final n7 f20337b;

    public k7(n7 n7Var, int i10) {
        this.f20336a = i10;
        this.f20337b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f20336a) {
            case 0:
                n7 n7Var = this.f20337b;
                n7Var.post(new k7(n7Var, 1));
                return;
            default:
                n7 n7Var2 = this.f20337b;
                n7Var2.f20451b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                return;
        }
    }
}
