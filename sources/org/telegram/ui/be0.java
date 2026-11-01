package org.telegram.ui;
public final class be0 implements org.telegram.ui.ActionBar.u1 {
    public final int f36033a;
    public final le0 f36034b;

    public be0(le0 le0Var, int i10) {
        this.f36033a = i10;
        this.f36034b = le0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36033a) {
            case 0:
                le0 le0Var = this.f36034b;
                le0Var.c(true);
                le0Var.f39259u0.D1(0, true, null, true);
                return;
            default:
                this.f36034b.f39259u0.D1(0, true, null, true);
                return;
        }
    }
}
