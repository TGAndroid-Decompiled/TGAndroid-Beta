package org.telegram.ui;

import android.content.Context;
public final class ai0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f37808n0;
    public final boolean f37809o0;
    public final ni0 f37810p0;

    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, u6Var, false);
        this.f37810p0 = ni0Var;
        this.f37808n0 = vgVar;
        this.f37809o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f37808n0.d();
    }

    @Override
    public final boolean e() {
        return this.f37808n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f37809o0 && this.f37810p0.f41920p0 && this.f33660r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f37808n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f37808n0.j();
    }
}
