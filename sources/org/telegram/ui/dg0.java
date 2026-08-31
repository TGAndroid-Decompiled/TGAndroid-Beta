package org.telegram.ui;
public final class dg0 implements Runnable {
    public final int f36219a;
    public final ng0 f36220b;

    public dg0(ng0 ng0Var, int i10) {
        this.f36219a = i10;
        this.f36220b = ng0Var;
    }

    @Override
    public final void run() {
        switch (this.f36219a) {
            case 0:
                ng0 ng0Var = this.f36220b;
                rj0 rj0Var = ng0Var.f39427a;
                og0 og0Var = ng0Var.S;
                kg0 kg0Var = ng0Var.f39428b;
                if (kg0Var != null) {
                    if (og0Var.Z) {
                        rj0Var.clearFocus();
                        kg0Var.clearFocus();
                    } else if (rj0Var.length() != 0) {
                        kg0Var.requestFocus();
                        if (!ng0Var.O) {
                            kg0Var.setSelection(kg0Var.length());
                        }
                        og0.T0(og0Var, kg0Var);
                    } else {
                        rj0Var.requestFocus();
                        og0.T0(og0Var, rj0Var);
                    }
                }
                if (og0Var.C == 0) {
                    ng0Var.t(false);
                    return;
                }
                return;
            case 1:
                ng0 ng0Var2 = this.f36220b;
                ng0Var2.postDelayed(new dg0(ng0Var2, 2), 200L);
                return;
            case 2:
                this.f36220b.h(null);
                return;
            case 3:
                this.f36220b.t(true);
                return;
            default:
                ng0 ng0Var3 = this.f36220b;
                og0.T0(ng0Var3.S, ng0Var3.f39428b);
                return;
        }
    }
}
