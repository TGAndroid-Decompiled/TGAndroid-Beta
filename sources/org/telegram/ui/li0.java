package org.telegram.ui;

import android.content.Context;
public final class li0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f35353l0;
    public final boolean m0;
    public final yi0 f35354n0;

    public li0(yi0 yi0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.f35354n0 = yi0Var;
        this.f35353l0 = vgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f35353l0.d();
    }

    @Override
    public final boolean e() {
        return this.f35353l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f35354n0.f40241q0 && this.f29126r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f35353l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f35353l0.j();
    }
}
