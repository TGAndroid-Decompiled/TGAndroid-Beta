package org.telegram.ui;

import android.content.Context;
public final class oi0 extends org.telegram.ui.Components.tg {
    public final org.telegram.ui.Components.tg f36233l0;
    public final boolean m0;
    public final bj0 f36234n0;

    public oi0(bj0 bj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.f36234n0 = bj0Var;
        this.f36233l0 = tgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36233l0.d();
    }

    @Override
    public final boolean e() {
        return this.f36233l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f36234n0.f32193q0 && this.f28123r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36233l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36233l0.j();
    }
}
