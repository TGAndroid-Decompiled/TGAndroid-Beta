package org.telegram.ui.Cells;
public final class m7 implements Runnable {
    public final int f22314a;
    public final o7 f22315b;

    public m7(o7 o7Var, int i10) {
        this.f22314a = i10;
        this.f22315b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f22314a) {
            case 0:
                o7 o7Var = this.f22315b;
                o7Var.post(new m7(o7Var, 1));
                return;
            default:
                o7 o7Var2 = this.f22315b;
                o7Var2.f22388b0.L0 = true;
                o7Var2.H.clear();
                o7Var2.I.clear();
                o7Var2.J.clear();
                o7Var2.invalidate();
                return;
        }
    }
}
