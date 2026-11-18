package org.telegram.ui.Cells;
public final class i7 implements Runnable {
    public final int f30824a;
    public final k7 f30825b;

    public i7(k7 k7Var, int i7) {
        this.f30824a = i7;
        this.f30825b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f30824a) {
            case 0:
                k7 k7Var = this.f30825b;
                k7Var.post(new i7(k7Var, 1));
                return;
            default:
                k7 k7Var2 = this.f30825b;
                k7Var2.f30936c0.N0 = true;
                k7Var2.I.clear();
                k7Var2.J.clear();
                k7Var2.K.clear();
                k7Var2.invalidate();
                return;
        }
    }
}
