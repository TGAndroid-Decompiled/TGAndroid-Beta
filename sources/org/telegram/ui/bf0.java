package org.telegram.ui;
public final class bf0 implements org.telegram.ui.ActionBar.z1 {
    public final int f36072a;
    public final mf0 f36073b;

    public bf0(mf0 mf0Var, int i10) {
        this.f36072a = i10;
        this.f36073b = mf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36072a) {
            case 0:
                mf0 mf0Var = this.f36073b;
                mf0Var.c(true);
                mf0Var.f39562u0.y1(0, true, null, true);
                return;
            default:
                this.f36073b.f39562u0.y1(0, true, null, true);
                return;
        }
    }
}
