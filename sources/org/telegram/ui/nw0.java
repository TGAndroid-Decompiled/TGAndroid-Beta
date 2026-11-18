package org.telegram.ui;
public final class nw0 implements c5.h {
    public int f50339a;
    public final ow0 f50340b;

    public nw0(ow0 ow0Var) {
        this.f50340b = ow0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        ow0 ow0Var = this.f50340b;
        ProfileActivity profileActivity = ow0Var.f50677n;
        int k10 = profileActivity.f43607o0.E0.k(i7);
        if (this.f50339a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ow0Var.a(z10);
        this.f50339a = k10;
        if (profileActivity.f43628r0 == null) {
            return;
        }
        if (profileActivity.T0.y()) {
            org.telegram.messenger.g0.h3(new ru0(ow0Var, 4), 500L);
        } else {
            ow0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.h2) this.f50340b.f50677n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
