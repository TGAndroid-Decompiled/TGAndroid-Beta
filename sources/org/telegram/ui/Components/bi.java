package org.telegram.ui.Components;

import android.content.Context;
public final class bi extends vg {
    public final ti f26856n0;

    public bi(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(i10, context, u6Var, false);
        this.f26856n0 = tiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f26856n0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f26856n0.getThemedColor(org.telegram.ui.ActionBar.y6.S5);
    }
}
