package org.telegram.ui.Cells;
public final class k7 implements Runnable {
    public final int f22220a;
    public final n7 f22221b;

    public k7(n7 n7Var, int i10) {
        this.f22220a = i10;
        this.f22221b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f22220a) {
            case 0:
                n7 n7Var = this.f22221b;
                n7Var.post(new k7(n7Var, 1));
                return;
            default:
                n7 n7Var2 = this.f22221b;
                n7Var2.f22347b0.isSpoilersRevealed = true;
                n7Var2.H.clear();
                n7Var2.I.clear();
                n7Var2.J.clear();
                n7Var2.invalidate();
                return;
        }
    }
}
