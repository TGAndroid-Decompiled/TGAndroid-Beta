package org.telegram.ui.Components;

import android.content.Context;
public final class ii extends xg {
    public final yi f24030l0;

    public ii(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(i10, context, f6Var, false);
        this.f24030l0 = yiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f24030l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f24030l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
