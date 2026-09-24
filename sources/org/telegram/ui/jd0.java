package org.telegram.ui;
public final class jd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34734a;
    public final qg0 f34735b;

    public jd0(qg0 qg0Var, int i10) {
        this.f34734a = i10;
        this.f34735b = qg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34734a) {
            case 0:
                qg0 qg0Var = this.f34735b;
                qg0Var.f36872b[qg0Var.f36870a].d();
                qg0Var.k1(true, true);
                return;
            default:
                qg0 qg0Var2 = this.f34735b;
                qg0Var2.f36885l0 = true;
                if (qg0Var2.f36870a != 0) {
                    qg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
