package org.telegram.ui;
public final class dw0 implements b5.h {
    public int f44820a;
    public final ew0 f44821b;

    public dw0(ew0 ew0Var) {
        this.f44821b = ew0Var;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        ew0 ew0Var = this.f44821b;
        ProfileActivity profileActivity = ew0Var.f45062n;
        int k10 = profileActivity.f41817o0.E0.k(i3);
        if (this.f44820a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ew0Var.a(z10);
        this.f44820a = k10;
        if (profileActivity.f41839r0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            org.telegram.messenger.g0.i3(new pu0(ew0Var, 3), 500L);
        } else {
            ew0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        pi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.d2) this.f44821b.f45062n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i3) {
    }
}
