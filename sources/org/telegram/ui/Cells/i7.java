package org.telegram.ui.Cells;
public final class i7 implements Runnable {
    public final int f29309a;
    public final k7 f29310b;

    public i7(k7 k7Var, int i7) {
        this.f29309a = i7;
        this.f29310b = k7Var;
    }

    @Override
    public final void run() {
        switch (this.f29309a) {
            case 0:
                k7 k7Var = this.f29310b;
                k7Var.post(new i7(k7Var, 1));
                return;
            default:
                k7 k7Var2 = this.f29310b;
                k7Var2.f29431b0.L0 = true;
                k7Var2.H.clear();
                k7Var2.I.clear();
                k7Var2.J.clear();
                k7Var2.invalidate();
                return;
        }
    }
}
