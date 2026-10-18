package org.telegram.ui;

import android.content.Context;
public final class bi0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f35717l0;
    public final boolean m0;
    public final oi0 f35718n0;

    public bi0(oi0 oi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f35718n0 = oi0Var;
        this.f35717l0 = vgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f35717l0.d();
    }

    @Override
    public final boolean e() {
        return this.f35717l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f35718n0.f39828q0 && this.f31277r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f35717l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f35717l0.j();
    }
}
