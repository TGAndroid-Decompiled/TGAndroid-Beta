package org.telegram.ui;

import android.content.Context;
public final class ai0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f35427l0;
    public final boolean m0;
    public final ni0 f35428n0;

    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f35428n0 = ni0Var;
        this.f35427l0 = vgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f35427l0.d();
    }

    @Override
    public final boolean e() {
        return this.f35427l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f35428n0.f39468q0 && this.f31270r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f35427l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f35427l0.j();
    }
}
