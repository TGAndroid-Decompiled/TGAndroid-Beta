package org.telegram.ui;
public final class jd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34748a;
    public final qg0 f34749b;

    public jd0(qg0 qg0Var, int i10) {
        this.f34748a = i10;
        this.f34749b = qg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34748a) {
            case 0:
                qg0 qg0Var = this.f34749b;
                qg0Var.f36887b[qg0Var.f36885a].d();
                qg0Var.k1(true, true);
                return;
            default:
                qg0 qg0Var2 = this.f34749b;
                qg0Var2.f36900l0 = true;
                if (qg0Var2.f36885a != 0) {
                    qg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
