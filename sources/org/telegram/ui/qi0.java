package org.telegram.ui;

import android.content.Context;
public final class qi0 extends org.telegram.ui.Components.tg {
    public final org.telegram.ui.Components.tg f36931l0;
    public final boolean m0;
    public final dj0 f36932n0;

    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.f36932n0 = dj0Var;
        this.f36931l0 = tgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36931l0.d();
    }

    @Override
    public final boolean e() {
        return this.f36931l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f36932n0.f33159q0 && this.f28094r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36931l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36931l0.j();
    }
}
