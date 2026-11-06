package org.telegram.ui;
public final class lw0 implements c5.g {
    public int f47597a;
    public final mw0 f47598b;

    public lw0(mw0 mw0Var) {
        this.f47598b = mw0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        mw0 mw0Var = this.f47598b;
        ProfileActivity profileActivity = mw0Var.f47893n;
        int k10 = profileActivity.f41781n0.D0.k(i7);
        if (this.f47597a != k10) {
            z9 = true;
        } else {
            z9 = false;
        }
        mw0Var.a(z9);
        this.f47597a = k10;
        if (profileActivity.f41800q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new ru0(mw0Var, 4), 500L);
        } else {
            mw0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f47598b.f47893n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
