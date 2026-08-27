package org.telegram.ui;

import android.content.Context;

public final class ai0 extends org.telegram.ui.Components.hg {

    public final org.telegram.ui.Components.hg f36539h0;

    public final boolean f36540i0;

    public final ni0 f36541j0;

    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.hg hgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.f36541j0 = ni0Var;
        this.f36539h0 = hgVar;
        this.f36540i0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36539h0.d();
    }

    @Override
    public final boolean e() {
        return this.f36539h0.e();
    }

    @Override
    public final boolean f() {
        return (this.f36540i0 && this.f36541j0.m0 && this.f29001r <= 0) ? false : true;
    }

    @Override
    public final int getFillColor() {
        return this.f36539h0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36539h0.j();
    }
}
