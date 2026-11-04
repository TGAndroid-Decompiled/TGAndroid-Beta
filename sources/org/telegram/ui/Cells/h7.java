package org.telegram.ui.Cells;
public final class h7 implements Runnable {
    public final int f29348a;
    public final j7 f29349b;

    public h7(j7 j7Var, int i3) {
        this.f29348a = i3;
        this.f29349b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f29348a) {
            case 0:
                j7 j7Var = this.f29349b;
                j7Var.post(new h7(j7Var, 1));
                return;
            default:
                j7 j7Var2 = this.f29349b;
                j7Var2.f29438c0.L0 = true;
                j7Var2.I.clear();
                j7Var2.J.clear();
                j7Var2.K.clear();
                j7Var2.invalidate();
                return;
        }
    }
}
