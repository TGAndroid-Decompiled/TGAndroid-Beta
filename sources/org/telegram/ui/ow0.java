package org.telegram.ui;
public final class ow0 implements c5.g {
    public int f48587a;
    public final pw0 f48588b;

    public ow0(pw0 pw0Var) {
        this.f48588b = pw0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        pw0 pw0Var = this.f48588b;
        ProfileActivity profileActivity = pw0Var.f48849n;
        int k10 = profileActivity.f41782n0.D0.k(i7);
        if (this.f48587a != k10) {
            z9 = true;
        } else {
            z9 = false;
        }
        pw0Var.a(z9);
        this.f48587a = k10;
        if (profileActivity.f41801q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new uu0(pw0Var, 4), 500L);
        } else {
            pw0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f48588b.f48849n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
