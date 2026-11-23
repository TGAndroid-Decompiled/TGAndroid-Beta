package org.telegram.ui.Cells;
public final class i7 implements Runnable {
    public final int f30919a;
    public final k7 f30920b;

    public i7(k7 k7Var, int i7) {
        this.f30919a = i7;
        this.f30920b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f30919a) {
            case 0:
                k7 k7Var = this.f30920b;
                k7Var.post(new i7(k7Var, 1));
                return;
            default:
                k7 k7Var2 = this.f30920b;
                k7Var2.f31022c0.N0 = true;
                k7Var2.I.clear();
                k7Var2.J.clear();
                k7Var2.K.clear();
                k7Var2.invalidate();
                return;
        }
    }
}
