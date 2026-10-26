package org.telegram.ui.Cells;
public final class p7 implements Runnable {
    public final int f24768a;
    public final r7 f24769b;

    public p7(r7 r7Var, int i10) {
        this.f24768a = i10;
        this.f24769b = r7Var;
    }

    @Override
    public final void run() {
        switch (this.f24768a) {
            case 0:
                r7 r7Var = this.f24769b;
                r7Var.post(new p7(r7Var, 1));
                return;
            default:
                r7 r7Var2 = this.f24769b;
                r7Var2.f24977b0.isSpoilersRevealed = true;
                r7Var2.H.clear();
                r7Var2.I.clear();
                r7Var2.J.clear();
                r7Var2.invalidate();
                return;
        }
    }
}
