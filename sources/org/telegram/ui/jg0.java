package org.telegram.ui;
public final class jg0 implements Runnable {
    public final int f37692a;
    public final tg0 f37693b;

    public jg0(tg0 tg0Var, int i10) {
        this.f37692a = i10;
        this.f37693b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f37692a) {
            case 0:
                tg0 tg0Var = this.f37693b;
                yj0 yj0Var = tg0Var.f40823a;
                ug0 ug0Var = tg0Var.V;
                qg0 qg0Var = tg0Var.f40824b;
                if (qg0Var != null) {
                    if (ug0Var.f41205c0) {
                        yj0Var.clearFocus();
                        qg0Var.clearFocus();
                    } else if (yj0Var.length() != 0) {
                        qg0Var.requestFocus();
                        if (!tg0Var.R) {
                            qg0Var.setSelection(qg0Var.length());
                        }
                        ug0.T0(ug0Var, qg0Var);
                    } else {
                        yj0Var.requestFocus();
                        ug0.T0(ug0Var, yj0Var);
                    }
                }
                if (ug0Var.F == 0) {
                    tg0Var.u(false);
                    return;
                }
                return;
            case 1:
                tg0 tg0Var2 = this.f37693b;
                tg0Var2.postDelayed(new jg0(tg0Var2, 2), 200L);
                return;
            case 2:
                this.f37693b.h(null);
                return;
            case 3:
                this.f37693b.u(true);
                return;
            default:
                tg0 tg0Var3 = this.f37693b;
                ug0.T0(tg0Var3.V, tg0Var3.f40824b);
                return;
        }
    }
}
