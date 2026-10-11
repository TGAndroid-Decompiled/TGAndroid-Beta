package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40221a;
    public final vg0 f40222b;

    public nd0(vg0 vg0Var, int i10) {
        this.f40221a = i10;
        this.f40222b = vg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40221a) {
            case 0:
                vg0 vg0Var = this.f40222b;
                vg0Var.f43013b[vg0Var.f43011a].d();
                vg0Var.k1(true, true);
                return;
            default:
                vg0 vg0Var2 = this.f40222b;
                vg0Var2.f43027l0 = true;
                if (vg0Var2.f43011a != 0) {
                    vg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
