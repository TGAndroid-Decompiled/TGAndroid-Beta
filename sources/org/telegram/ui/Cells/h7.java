package org.telegram.ui.Cells;
public final class h7 implements Runnable {
    public final int f30407a;
    public final j7 f30408b;

    public h7(j7 j7Var, int i7) {
        this.f30407a = i7;
        this.f30408b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f30407a) {
            case 0:
                j7 j7Var = this.f30408b;
                j7Var.post(new h7(j7Var, 1));
                return;
            default:
                j7 j7Var2 = this.f30408b;
                j7Var2.f30499c0.N0 = true;
                j7Var2.I.clear();
                j7Var2.J.clear();
                j7Var2.K.clear();
                j7Var2.invalidate();
                return;
        }
    }
}
