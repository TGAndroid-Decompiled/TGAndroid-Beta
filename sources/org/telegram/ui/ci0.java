package org.telegram.ui;

import android.content.Context;
public final class ci0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f38368n0;
    public final boolean f38369o0;
    public final pi0 f38370p0;

    public ci0(pi0 pi0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, u6Var, false);
        this.f38370p0 = pi0Var;
        this.f38368n0 = vgVar;
        this.f38369o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f38368n0.d();
    }

    @Override
    public final boolean e() {
        return this.f38368n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f38369o0 && this.f38370p0.f42426p0 && this.f33733r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f38368n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f38368n0.j();
    }
}
