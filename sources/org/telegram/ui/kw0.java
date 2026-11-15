package org.telegram.ui;
public final class kw0 implements c5.h {
    public int f48787a;
    public final lw0 f48788b;

    public kw0(lw0 lw0Var) {
        this.f48788b = lw0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        lw0 lw0Var = this.f48788b;
        ProfileActivity profileActivity = lw0Var.f49055n;
        int k10 = profileActivity.f43161o0.E0.k(i7);
        if (this.f48787a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        lw0Var.a(z10);
        this.f48787a = k10;
        if (profileActivity.f43182r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.i3(new pu0(lw0Var, 4), 500L);
        } else {
            lw0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.e2) this.f48788b.f49055n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
