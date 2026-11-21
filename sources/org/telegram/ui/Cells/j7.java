package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f30916a;
    public final l7 f30917b;

    public j7(l7 l7Var, int i7) {
        this.f30916a = i7;
        this.f30917b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f30916a) {
            case 0:
                l7 l7Var = this.f30917b;
                l7Var.post(new j7(l7Var, 1));
                return;
            default:
                l7 l7Var2 = this.f30917b;
                l7Var2.f31027c0.N0 = true;
                l7Var2.I.clear();
                l7Var2.J.clear();
                l7Var2.K.clear();
                l7Var2.invalidate();
                return;
        }
    }
}
