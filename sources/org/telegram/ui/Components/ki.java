package org.telegram.ui.Components;

import android.content.Context;
public final class ki extends zg {
    public final aj f27869l0;

    public ki(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(i10, context, c6Var, false);
        this.f27869l0 = ajVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f27869l0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f27869l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
