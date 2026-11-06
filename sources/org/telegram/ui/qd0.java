package org.telegram.ui;
public final class qd0 implements Runnable {
    public final int f49179a;
    public final be0 f49180b;

    public qd0(be0 be0Var, int i7) {
        this.f49179a = i7;
        this.f49180b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f49179a) {
            case 0:
                be0 be0Var = this.f49180b;
                zd0 zd0Var = be0Var.f44275a;
                ce0 ce0Var = be0Var.f44286g0;
                zd0 zd0Var2 = be0Var.f44277b;
                if (zd0Var2 != null) {
                    if (ce0Var.f44741c0) {
                        zd0Var.clearFocus();
                        zd0Var2.clearFocus();
                    } else if (zd0Var.length() != 0) {
                        zd0Var2.requestFocus();
                        if (!be0Var.T) {
                            zd0Var2.setSelection(zd0Var2.length());
                        }
                        ce0.b1(ce0Var, zd0Var2);
                    } else {
                        zd0Var.requestFocus();
                        ce0.b1(ce0Var, zd0Var);
                    }
                }
                if (ce0Var.F == 0) {
                    be0Var.s();
                    return;
                }
                return;
            case 1:
                be0 be0Var2 = this.f49180b;
                be0Var2.postDelayed(new qd0(be0Var2, 2), 200L);
                return;
            case 2:
                this.f49180b.h(null);
                return;
            case 3:
                this.f49180b.t(true);
                return;
            default:
                be0 be0Var3 = this.f49180b;
                ce0.b1(be0Var3.f44286g0, be0Var3.f44277b);
                return;
        }
    }
}
