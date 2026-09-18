package org.telegram.ui;

import android.content.Context;
public final class pi0 extends org.telegram.ui.Components.ug {
    public final org.telegram.ui.Components.ug f36494l0;
    public final boolean m0;
    public final cj0 f36495n0;

    public pi0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.f36495n0 = cj0Var;
        this.f36494l0 = ugVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36494l0.d();
    }

    @Override
    public final boolean e() {
        return this.f36494l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f36495n0.f32691q0 && this.f28703r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36494l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36494l0.j();
    }
}
