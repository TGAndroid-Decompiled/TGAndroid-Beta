package org.telegram.ui;
public final class jg0 implements Runnable {
    public final int f37686a;
    public final tg0 f37687b;

    public jg0(tg0 tg0Var, int i10) {
        this.f37686a = i10;
        this.f37687b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f37686a) {
            case 0:
                tg0 tg0Var = this.f37687b;
                yj0 yj0Var = tg0Var.f40816a;
                ug0 ug0Var = tg0Var.V;
                qg0 qg0Var = tg0Var.f40817b;
                if (qg0Var != null) {
                    if (ug0Var.f41197c0) {
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
                tg0 tg0Var2 = this.f37687b;
                tg0Var2.postDelayed(new jg0(tg0Var2, 2), 200L);
                return;
            case 2:
                this.f37687b.h(null);
                return;
            case 3:
                this.f37687b.u(true);
                return;
            default:
                tg0 tg0Var3 = this.f37687b;
                ug0.T0(tg0Var3.V, tg0Var3.f40817b);
                return;
        }
    }
}
