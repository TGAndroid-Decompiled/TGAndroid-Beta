package org.telegram.ui;
public final class k40 implements Runnable {
    public final int f38679a;
    public final m40 f38680b;

    public k40(m40 m40Var, int i10) {
        this.f38679a = i10;
        this.f38680b = m40Var;
    }

    @Override
    public final void run() {
        switch (this.f38679a) {
            case 0:
                m40 m40Var = this.f38680b;
                bi.t0 t0Var = m40Var.f39469b;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                org.telegram.messenger.i0.h3(new k40(m40Var, 2), 16L);
                return;
            case 1:
                bi.t0 t0Var2 = this.f38680b.f39469b;
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
