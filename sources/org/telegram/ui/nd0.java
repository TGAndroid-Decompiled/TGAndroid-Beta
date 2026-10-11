package org.telegram.ui;
public final class nd0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40255a;
    public final vg0 f40256b;

    public nd0(vg0 vg0Var, int i10) {
        this.f40255a = i10;
        this.f40256b = vg0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40255a) {
            case 0:
                vg0 vg0Var = this.f40256b;
                vg0Var.f43047b[vg0Var.f43045a].d();
                vg0Var.k1(true, true);
                return;
            default:
                vg0 vg0Var2 = this.f40256b;
                vg0Var2.f43061l0 = true;
                if (vg0Var2.f43045a != 0) {
                    vg0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
