package org.telegram.ui;
public final class qd0 implements Runnable {
    public final int f49208a;
    public final be0 f49209b;

    public qd0(be0 be0Var, int i7) {
        this.f49208a = i7;
        this.f49209b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f49208a) {
            case 0:
                be0 be0Var = this.f49209b;
                zd0 zd0Var = be0Var.f44293a;
                ce0 ce0Var = be0Var.f44304g0;
                zd0 zd0Var2 = be0Var.f44295b;
                if (zd0Var2 != null) {
                    if (ce0Var.f44766c0) {
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
                be0 be0Var2 = this.f49209b;
                be0Var2.postDelayed(new qd0(be0Var2, 2), 200L);
                return;
            case 2:
                this.f49209b.h(null);
                return;
            case 3:
                this.f49209b.t(true);
                return;
            default:
                be0 be0Var3 = this.f49209b;
                ce0.b1(be0Var3.f44304g0, be0Var3.f44295b);
                return;
        }
    }
}
