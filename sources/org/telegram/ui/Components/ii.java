package org.telegram.ui.Components;

import android.content.Context;
public final class ii extends xg {
    public final yi f27455l0;

    public ii(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, yi yiVar) {
        super(i10, context, d6Var, false);
        this.f27455l0 = yiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f27455l0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f27455l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
