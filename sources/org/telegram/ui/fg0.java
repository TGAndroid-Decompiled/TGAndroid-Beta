package org.telegram.ui;
public final class fg0 implements Runnable {
    public final int f33657a;
    public final pg0 f33658b;

    public fg0(pg0 pg0Var, int i10) {
        this.f33657a = i10;
        this.f33658b = pg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33657a) {
            case 0:
                pg0 pg0Var = this.f33658b;
                uj0 uj0Var = pg0Var.f36509a;
                qg0 qg0Var = pg0Var.V;
                mg0 mg0Var = pg0Var.f36510b;
                if (mg0Var != null) {
                    if (qg0Var.f36875c0) {
                        uj0Var.clearFocus();
                        mg0Var.clearFocus();
                    } else if (uj0Var.length() != 0) {
                        mg0Var.requestFocus();
                        if (!pg0Var.R) {
                            mg0Var.setSelection(mg0Var.length());
                        }
                        qg0.T0(qg0Var, mg0Var);
                    } else {
                        uj0Var.requestFocus();
                        qg0.T0(qg0Var, uj0Var);
                    }
                }
                if (qg0Var.F == 0) {
                    pg0Var.u(false);
                    return;
                }
                return;
            case 1:
                pg0 pg0Var2 = this.f33658b;
                pg0Var2.postDelayed(new fg0(pg0Var2, 2), 200L);
                return;
            case 2:
                this.f33658b.h(null);
                return;
            case 3:
                this.f33658b.u(true);
                return;
            default:
                pg0 pg0Var3 = this.f33658b;
                qg0.T0(pg0Var3.V, pg0Var3.f36510b);
                return;
        }
    }
}
