package org.telegram.ui;
public final class hd0 implements org.telegram.ui.ActionBar.c2 {
    public final int f34816a;
    public final ng0 f34817b;

    public hd0(ng0 ng0Var, int i10) {
        this.f34816a = i10;
        this.f34817b = ng0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34816a) {
            case 0:
                ng0 ng0Var = this.f34817b;
                ng0Var.f36624b[ng0Var.f36622a].d();
                ng0Var.k1(true, true);
                return;
            default:
                ng0 ng0Var2 = this.f34817b;
                ng0Var2.f36634i0 = true;
                if (ng0Var2.f36622a != 0) {
                    ng0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
