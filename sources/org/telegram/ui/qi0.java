package org.telegram.ui;

import android.content.Context;
public final class qi0 extends org.telegram.ui.Components.ug {
    public final org.telegram.ui.Components.ug f36922l0;
    public final boolean m0;
    public final dj0 f36923n0;

    public qi0(dj0 dj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.f36923n0 = dj0Var;
        this.f36922l0 = ugVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f36922l0.d();
    }

    @Override
    public final boolean e() {
        return this.f36922l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f36923n0.f33078q0 && this.f28673r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f36922l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f36922l0.j();
    }
}
