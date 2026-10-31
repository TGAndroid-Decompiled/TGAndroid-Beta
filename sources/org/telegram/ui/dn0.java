package org.telegram.ui;
public final class dn0 implements Runnable {
    public final int f36804a;
    public final nn0 f36805b;

    public dn0(nn0 nn0Var, int i10) {
        this.f36804a = i10;
        this.f36805b = nn0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36804a;
        nn0 nn0Var = this.f36805b;
        switch (i10) {
            case 0:
                if (nn0Var.G) {
                    nn0Var.f39984b.invalidate();
                    return;
                }
                return;
            case 1:
                nn0Var.h();
                return;
            case 2:
                int i11 = nn0.f39981q0;
                nn0Var.h();
                return;
            default:
                int i12 = nn0.f39981q0;
                nn0Var.h();
                return;
        }
    }
}
