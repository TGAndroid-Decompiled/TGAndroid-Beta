package org.telegram.ui.Components;

import android.content.Context;
public final class gi extends ug {
    public final wi f24299l0;

    public gi(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(i10, context, d6Var, false);
        this.f24299l0 = wiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f24299l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f24299l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
