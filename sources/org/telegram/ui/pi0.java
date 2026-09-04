package org.telegram.ui;

import android.content.Context;
public final class pi0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f39526l0;
    public final boolean m0;
    public final cj0 f39527n0;

    public pi0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.f39527n0 = cj0Var;
        this.f39526l0 = vgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f39526l0.d();
    }

    @Override
    public final boolean e() {
        return this.f39526l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f39527n0.f35148q0 && this.f31239r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f39526l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f39526l0.j();
    }
}
