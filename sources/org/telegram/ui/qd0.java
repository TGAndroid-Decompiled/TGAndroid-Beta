package org.telegram.ui;
public final class qd0 implements Runnable {
    public final int f50583a;
    public final be0 f50584b;

    public qd0(be0 be0Var, int i7) {
        this.f50583a = i7;
        this.f50584b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f50583a) {
            case 0:
                be0 be0Var = this.f50584b;
                zd0 zd0Var = be0Var.f45681a;
                ce0 ce0Var = be0Var.f45693h0;
                zd0 zd0Var2 = be0Var.f45683b;
                if (zd0Var2 != null) {
                    if (ce0Var.f46080d0) {
                        zd0Var.clearFocus();
                        zd0Var2.clearFocus();
                    } else if (zd0Var.length() != 0) {
                        zd0Var2.requestFocus();
                        if (!be0Var.U) {
                            zd0Var2.setSelection(zd0Var2.length());
                        }
                        ce0.b1(ce0Var, zd0Var2);
                    } else {
                        zd0Var.requestFocus();
                        ce0.b1(ce0Var, zd0Var);
                    }
                }
                if (ce0Var.G == 0) {
                    be0Var.s();
                    return;
                }
                return;
            case 1:
                be0 be0Var2 = this.f50584b;
                be0Var2.postDelayed(new qd0(be0Var2, 2), 200L);
                return;
            case 2:
                this.f50584b.h(null);
                return;
            case 3:
                this.f50584b.t(true);
                return;
            default:
                be0 be0Var3 = this.f50584b;
                ce0.b1(be0Var3.f45693h0, be0Var3.f45683b);
                return;
        }
    }
}
