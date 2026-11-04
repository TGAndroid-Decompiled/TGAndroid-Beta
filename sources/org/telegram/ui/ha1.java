package org.telegram.ui;
public final class ha1 implements org.telegram.ui.ActionBar.p1 {
    public final int f45886a;
    public final ra1 f45887b;

    public ha1(ra1 ra1Var, int i3) {
        this.f45886a = i3;
        this.f45887b = ra1Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45886a) {
            case 0:
                this.f45887b.finishFragment();
                return;
            case 1:
                ra1 ra1Var = this.f45887b;
                ra1Var.G0();
                ra1Var.finishFragment();
                return;
            case 2:
                ra1 ra1Var2 = this.f45887b;
                ra1Var2.S = "";
                ra1Var2.J0(false);
                return;
            case 3:
                ra1.f0(this.f45887b);
                return;
            default:
                ra1.c0(this.f45887b);
                return;
        }
    }
}
