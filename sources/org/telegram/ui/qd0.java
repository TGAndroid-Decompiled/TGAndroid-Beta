package org.telegram.ui;
public final class qd0 implements Runnable {
    public final int f50592a;
    public final be0 f50593b;

    public qd0(be0 be0Var, int i7) {
        this.f50592a = i7;
        this.f50593b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f50592a) {
            case 0:
                be0 be0Var = this.f50593b;
                zd0 zd0Var = be0Var.f45687a;
                ce0 ce0Var = be0Var.f45699h0;
                zd0 zd0Var2 = be0Var.f45689b;
                if (zd0Var2 != null) {
                    if (ce0Var.f46091d0) {
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
                be0 be0Var2 = this.f50593b;
                be0Var2.postDelayed(new qd0(be0Var2, 2), 200L);
                return;
            case 2:
                this.f50593b.h(null);
                return;
            case 3:
                this.f50593b.t(true);
                return;
            default:
                be0 be0Var3 = this.f50593b;
                ce0.b1(be0Var3.f45699h0, be0Var3.f45689b);
                return;
        }
    }
}
