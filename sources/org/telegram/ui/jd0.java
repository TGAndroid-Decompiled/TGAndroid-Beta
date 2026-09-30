package org.telegram.ui;
public final class jd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34841a;
    public final qg0 f34842b;

    public jd0(qg0 qg0Var, int i10) {
        this.f34841a = i10;
        this.f34842b = qg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34841a) {
            case 0:
                qg0 qg0Var = this.f34842b;
                qg0Var.f36987b[qg0Var.f36985a].d();
                qg0Var.k1(true, true);
                return;
            default:
                qg0 qg0Var2 = this.f34842b;
                qg0Var2.f37000l0 = true;
                if (qg0Var2.f36985a != 0) {
                    qg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
