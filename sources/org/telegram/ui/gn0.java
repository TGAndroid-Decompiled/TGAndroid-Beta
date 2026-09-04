package org.telegram.ui;
public final class gn0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36722a;
    public final ln0 f36723b;

    public gn0(ln0 ln0Var, int i10) {
        this.f36722a = i10;
        this.f36723b = ln0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36722a) {
            case 0:
                ln0 ln0Var = this.f36723b;
                ln0Var.c(true);
                ln0Var.Q.finishFragment();
                return;
            default:
                ln0 ln0Var2 = this.f36723b;
                ln0Var2.c(true);
                ln0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
