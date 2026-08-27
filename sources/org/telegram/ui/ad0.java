package org.telegram.ui;

public final class ad0 implements org.telegram.ui.ActionBar.a2 {

    public final int f36512a;

    public final ig0 f36513b;

    public ad0(ig0 ig0Var, int i10) {
        this.f36512a = i10;
        this.f36513b = ig0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36512a) {
            case 0:
                ig0 ig0Var = this.f36513b;
                ig0Var.f39081b[ig0Var.f39079a].d();
                ig0Var.k1(true, true);
                break;
            default:
                ig0 ig0Var2 = this.f36513b;
                ig0Var2.f39091h0 = true;
                if (ig0Var2.f39079a != 0) {
                    ig0Var2.u1(0, true, null, true);
                }
                break;
        }
    }
}
