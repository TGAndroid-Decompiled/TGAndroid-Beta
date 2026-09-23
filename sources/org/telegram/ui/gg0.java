package org.telegram.ui;
public final class gg0 implements Runnable {
    public final int f33561a;
    public final qg0 f33562b;

    public gg0(qg0 qg0Var, int i10) {
        this.f33561a = i10;
        this.f33562b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33561a) {
            case 0:
                qg0 qg0Var = this.f33562b;
                uj0 uj0Var = qg0Var.f36422a;
                rg0 rg0Var = qg0Var.V;
                ng0 ng0Var = qg0Var.f36423b;
                if (ng0Var != null) {
                    if (rg0Var.f36823c0) {
                        uj0Var.clearFocus();
                        ng0Var.clearFocus();
                    } else if (uj0Var.length() != 0) {
                        ng0Var.requestFocus();
                        if (!qg0Var.R) {
                            ng0Var.setSelection(ng0Var.length());
                        }
                        rg0.T0(rg0Var, ng0Var);
                    } else {
                        uj0Var.requestFocus();
                        rg0.T0(rg0Var, uj0Var);
                    }
                }
                if (rg0Var.F == 0) {
                    qg0Var.u(false);
                    return;
                }
                return;
            case 1:
                qg0 qg0Var2 = this.f33562b;
                qg0Var2.postDelayed(new gg0(qg0Var2, 2), 200L);
                return;
            case 2:
                this.f33562b.h(null);
                return;
            case 3:
                this.f33562b.u(true);
                return;
            default:
                qg0 qg0Var3 = this.f33562b;
                rg0.T0(qg0Var3.V, qg0Var3.f36423b);
                return;
        }
    }
}
