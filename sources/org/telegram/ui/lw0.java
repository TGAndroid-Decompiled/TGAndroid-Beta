package org.telegram.ui;
public final class lw0 implements c5.g {
    public int f47570a;
    public final mw0 f47571b;

    public lw0(mw0 mw0Var) {
        this.f47571b = mw0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        mw0 mw0Var = this.f47571b;
        ProfileActivity profileActivity = mw0Var.f47867n;
        int k10 = profileActivity.f41756n0.D0.k(i7);
        if (this.f47570a != k10) {
            z9 = true;
        } else {
            z9 = false;
        }
        mw0Var.a(z9);
        this.f47570a = k10;
        if (profileActivity.f41775q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new qu0(mw0Var, 4), 500L);
        } else {
            mw0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f47571b.f47867n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
