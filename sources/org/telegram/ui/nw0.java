package org.telegram.ui;
public final class nw0 implements c5.h {
    public int f50334a;
    public final ow0 f50335b;

    public nw0(ow0 ow0Var) {
        this.f50335b = ow0Var;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        ow0 ow0Var = this.f50335b;
        ProfileActivity profileActivity = ow0Var.f50670n;
        int k10 = profileActivity.f43652o0.E0.k(i7);
        if (this.f50334a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ow0Var.a(z10);
        this.f50334a = k10;
        if (profileActivity.f43673r0 == null) {
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
        qVar = ((org.telegram.ui.ActionBar.g2) this.f50335b.f50670n).glassEngine;
        qVar.g();
    }

    @Override
    public final void c(int i7) {
    }
}
