package org.telegram.ui;
public final class j40 implements Runnable {
    public final int f38271a;
    public final l40 f38272b;

    public j40(l40 l40Var, int i10) {
        this.f38271a = i10;
        this.f38272b = l40Var;
    }

    @Override
    public final void run() {
        switch (this.f38271a) {
            case 0:
                l40 l40Var = this.f38272b;
                bi.t0 t0Var = l40Var.f39073b;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                org.telegram.messenger.i0.h3(new j40(l40Var, 2), 16L);
                return;
            case 1:
                bi.t0 t0Var2 = this.f38272b.f39073b;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
