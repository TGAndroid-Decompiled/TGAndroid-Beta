package org.telegram.ui;
public final class cg0 implements Runnable {
    public final int f33368a;
    public final mg0 f33369b;

    public cg0(mg0 mg0Var, int i10) {
        this.f33368a = i10;
        this.f33369b = mg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33368a) {
            case 0:
                mg0 mg0Var = this.f33369b;
                qj0 qj0Var = mg0Var.f36293a;
                ng0 ng0Var = mg0Var.S;
                jg0 jg0Var = mg0Var.f36294b;
                if (jg0Var != null) {
                    if (ng0Var.Z) {
                        qj0Var.clearFocus();
                        jg0Var.clearFocus();
                    } else if (qj0Var.length() != 0) {
                        jg0Var.requestFocus();
                        if (!mg0Var.O) {
                            jg0Var.setSelection(jg0Var.length());
                        }
                        ng0.T0(ng0Var, jg0Var);
                    } else {
                        qj0Var.requestFocus();
                        ng0.T0(ng0Var, qj0Var);
                    }
                }
                if (ng0Var.C == 0) {
                    mg0Var.t(false);
                    return;
                }
                return;
            case 1:
                mg0 mg0Var2 = this.f33369b;
                mg0Var2.postDelayed(new cg0(mg0Var2, 2), 200L);
                return;
            case 2:
                this.f33369b.h(null);
                return;
            case 3:
                this.f33369b.t(true);
                return;
            default:
                mg0 mg0Var3 = this.f33369b;
                ng0.T0(mg0Var3.S, mg0Var3.f36294b);
                return;
        }
    }
}
