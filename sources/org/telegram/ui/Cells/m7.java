package org.telegram.ui.Cells;
public final class m7 implements Runnable {
    public final int f20668a;
    public final o7 f20669b;

    public m7(o7 o7Var, int i10) {
        this.f20668a = i10;
        this.f20669b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f20668a) {
            case 0:
                o7 o7Var = this.f20669b;
                o7Var.post(new m7(o7Var, 1));
                return;
            default:
                o7 o7Var2 = this.f20669b;
                o7Var2.f20774b0.isSpoilersRevealed = true;
                o7Var2.H.clear();
                o7Var2.I.clear();
                o7Var2.J.clear();
                o7Var2.invalidate();
                return;
        }
    }
}
