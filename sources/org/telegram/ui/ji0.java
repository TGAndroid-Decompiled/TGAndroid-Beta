package org.telegram.ui;

import android.content.Context;
public final class ji0 extends org.telegram.ui.Components.ug {
    public final org.telegram.ui.Components.ug f34462l0;
    public final boolean m0;
    public final wi0 f34463n0;

    public ji0(wi0 wi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f34463n0 = wi0Var;
        this.f34462l0 = ugVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f34462l0.d();
    }

    @Override
    public final boolean e() {
        return this.f34462l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f34463n0.f39016q0 && this.f28497r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f34462l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f34462l0.j();
    }
}
