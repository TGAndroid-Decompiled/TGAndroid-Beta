package org.telegram.ui;
public final class jd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34749a;
    public final qg0 f34750b;

    public jd0(qg0 qg0Var, int i10) {
        this.f34749a = i10;
        this.f34750b = qg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34749a) {
            case 0:
                qg0 qg0Var = this.f34750b;
                qg0Var.f36888b[qg0Var.f36886a].d();
                qg0Var.k1(true, true);
                return;
            default:
                qg0 qg0Var2 = this.f34750b;
                qg0Var2.f36901l0 = true;
                if (qg0Var2.f36886a != 0) {
                    qg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
