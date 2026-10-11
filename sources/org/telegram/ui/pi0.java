package org.telegram.ui;

import android.content.Context;
public final class pi0 extends org.telegram.ui.Components.xg {
    public final org.telegram.ui.Components.xg f40876l0;
    public final boolean m0;
    public final cj0 f40877n0;

    public pi0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.xg xgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f40877n0 = cj0Var;
        this.f40876l0 = xgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f40876l0.d();
    }

    @Override
    public final boolean e() {
        return this.f40876l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f40877n0.f36744q0 && this.f32911r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f40876l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f40876l0.j();
    }
}
