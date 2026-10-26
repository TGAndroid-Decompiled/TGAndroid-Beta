package org.telegram.ui;

import android.content.Context;
public final class ai0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f37811n0;
    public final boolean f37812o0;
    public final ni0 f37813p0;

    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, u6Var, false);
        this.f37813p0 = ni0Var;
        this.f37811n0 = vgVar;
        this.f37812o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f37811n0.d();
    }

    @Override
    public final boolean e() {
        return this.f37811n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f37812o0 && this.f37813p0.f41923p0 && this.f33663r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f37811n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f37811n0.j();
    }
}
