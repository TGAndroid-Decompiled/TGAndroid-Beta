package org.telegram.ui;
public final class nw0 implements c5.g {
    public int f48243a;
    public final ow0 f48244b;

    public nw0(ow0 ow0Var) {
        this.f48244b = ow0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        ow0 ow0Var = this.f48244b;
        ProfileActivity profileActivity = ow0Var.f48533n;
        int k10 = profileActivity.f41791n0.D0.k(i7);
        if (this.f48243a != k10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ow0Var.a(z9);
        this.f48243a = k10;
        if (profileActivity.f41810q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.g0.i3(new tu0(ow0Var, 4), 500L);
        } else {
            ow0Var.c();
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f48244b.f48533n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
