package org.telegram.ui;
public final class af0 implements org.telegram.ui.ActionBar.z1 {
    public final int f35750a;
    public final lf0 f35751b;

    public af0(lf0 lf0Var, int i10) {
        this.f35750a = i10;
        this.f35751b = lf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35750a) {
            case 0:
                lf0 lf0Var = this.f35751b;
                lf0Var.c(true);
                lf0Var.f39255u0.y1(0, true, null, true);
                return;
            default:
                this.f35751b.f39255u0.y1(0, true, null, true);
                return;
        }
    }
}
