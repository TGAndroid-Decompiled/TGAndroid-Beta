package org.telegram.ui;
public final class ce0 implements org.telegram.ui.ActionBar.u1 {
    public final int f36450a;
    public final me0 f36451b;

    public ce0(me0 me0Var, int i10) {
        this.f36450a = i10;
        this.f36451b = me0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36450a) {
            case 0:
                me0 me0Var = this.f36451b;
                me0Var.c(true);
                me0Var.f39682u0.C1(0, true, null, true);
                return;
            default:
                this.f36451b.f39682u0.C1(0, true, null, true);
                return;
        }
    }
}
