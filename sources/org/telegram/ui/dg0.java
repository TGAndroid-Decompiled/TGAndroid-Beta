package org.telegram.ui;
public final class dg0 implements Runnable {
    public final int f36184a;
    public final ng0 f36185b;

    public dg0(ng0 ng0Var, int i10) {
        this.f36184a = i10;
        this.f36185b = ng0Var;
    }

    @Override
    public final void run() {
        switch (this.f36184a) {
            case 0:
                ng0 ng0Var = this.f36185b;
                rj0 rj0Var = ng0Var.f39343a;
                og0 og0Var = ng0Var.S;
                kg0 kg0Var = ng0Var.f39344b;
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
                ng0 ng0Var2 = this.f36185b;
                ng0Var2.postDelayed(new dg0(ng0Var2, 2), 200L);
                return;
            case 2:
                this.f36185b.h(null);
                return;
            case 3:
                this.f36185b.t(true);
                return;
            default:
                ng0 ng0Var3 = this.f36185b;
                og0.T0(ng0Var3.S, ng0Var3.f39344b);
                return;
        }
    }
}
