package org.telegram.ui;

import android.content.Context;
public final class qi0 extends org.telegram.ui.Components.tg {
    public final org.telegram.ui.Components.tg f36926l0;
    public final boolean m0;
    public final dj0 f36927n0;

    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.f36927n0 = dj0Var;
        this.f36926l0 = tgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36926l0.d();
    }

    @Override
    public final boolean e() {
        return this.f36926l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f36927n0.f33155q0 && this.f28091r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36926l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36926l0.j();
    }
}
