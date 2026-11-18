package org.telegram.ui.Cells;
public final class j7 implements Runnable {
    public final int f30888a;
    public final l7 f30889b;

    public j7(l7 l7Var, int i7) {
        this.f30888a = i7;
        this.f30889b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f30888a) {
            case 0:
                l7 l7Var = this.f30889b;
                l7Var.post(new j7(l7Var, 1));
                return;
            default:
                l7 l7Var2 = this.f30889b;
                l7Var2.f30999c0.N0 = true;
                l7Var2.I.clear();
                l7Var2.J.clear();
                l7Var2.K.clear();
                l7Var2.invalidate();
                return;
        }
    }
}
