package org.telegram.ui.Cells;
public final class k7 implements Runnable {
    public final int f22221a;
    public final n7 f22222b;

    public k7(n7 n7Var, int i10) {
        this.f22221a = i10;
        this.f22222b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f22221a) {
            case 0:
                n7 n7Var = this.f22222b;
                n7Var.post(new k7(n7Var, 1));
                return;
            default:
                n7 n7Var2 = this.f22222b;
                n7Var2.f22348b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                return;
        }
    }
}
