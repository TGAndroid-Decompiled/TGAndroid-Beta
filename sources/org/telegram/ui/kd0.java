package org.telegram.ui;
public final class kd0 implements org.telegram.ui.ActionBar.a2 {
    public final int f34681a;
    public final rg0 f34682b;

    public kd0(rg0 rg0Var, int i10) {
        this.f34681a = i10;
        this.f34682b = rg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34681a) {
            case 0:
                rg0 rg0Var = this.f34682b;
                rg0Var.f36820b[rg0Var.f36818a].d();
                rg0Var.k1(true, true);
                return;
            default:
                rg0 rg0Var2 = this.f34682b;
                rg0Var2.f36833l0 = true;
                if (rg0Var2.f36818a != 0) {
                    rg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
