package org.telegram.ui.ActionBar;
public final class k2 implements Runnable {
    public final int f27636a;
    public final j5 f27637b;

    public k2(j5 j5Var, int i7) {
        this.f27636a = i7;
        this.f27637b = j5Var;
    }

    @Override
    public final void run() {
        switch (this.f27636a) {
            case 0:
                this.f27637b.a(true);
                return;
            case 1:
                j5 j5Var = this.f27637b;
                if (!j5Var.D && j5Var.N) {
                    j5Var.c();
                    return;
                }
                return;
            default:
                this.f27637b.a(true);
                return;
        }
    }
}
