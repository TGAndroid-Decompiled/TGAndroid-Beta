package org.telegram.ui;

import android.content.Context;
public final class qi0 extends org.telegram.ui.Components.xg {
    public final org.telegram.ui.Components.xg f41130l0;
    public final boolean m0;
    public final dj0 f41131n0;

    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.xg xgVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.f41131n0 = dj0Var;
        this.f41130l0 = xgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f41130l0.d();
    }

    @Override
    public final boolean e() {
        return this.f41130l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f41131n0.f37009q0 && this.f32845r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f41130l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f41130l0.j();
    }
}
