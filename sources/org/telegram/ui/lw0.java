package org.telegram.ui;
public final class lw0 implements c5.h {
    public int f49850a;
    public final mw0 f49851b;

    public lw0(mw0 mw0Var) {
        this.f49851b = mw0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        mw0 mw0Var = this.f49851b;
        ProfileActivity profileActivity = mw0Var.f50133n;
        int k10 = profileActivity.f43733o0.E0.k(i7);
        if (this.f49850a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        mw0Var.a(z10);
        this.f49850a = k10;
        if (profileActivity.f43754r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.h3(new qu0(mw0Var, 4), 500L);
        } else {
            mw0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.g2) this.f49851b.f50133n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
