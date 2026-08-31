package org.telegram.ui;

import android.content.Context;
public final class gi0 extends org.telegram.ui.Components.lg {
    public final org.telegram.ui.Components.lg f37205i0;
    public final boolean f37206j0;
    public final ti0 f37207k0;

    public gi0(ti0 ti0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.lg lgVar, boolean z4) {
        super(i10, context, g6Var, false);
        this.f37207k0 = ti0Var;
        this.f37205i0 = lgVar;
        this.f37206j0 = z4;
    }

    @Override
    public final boolean d() {
        return this.f37205i0.d();
    }

    @Override
    public final boolean e() {
        return this.f37205i0.e();
    }

    @Override
    public final boolean f() {
        if (this.f37206j0 && this.f37207k0.f41642n0 && this.f28725r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f37205i0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f37205i0.j();
    }
}
