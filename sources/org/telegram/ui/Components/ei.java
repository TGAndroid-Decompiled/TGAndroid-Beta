package org.telegram.ui.Components;

import android.content.Context;
public final class ei extends vg {
    public final ti f25978n0;

    public ei(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar) {
        super(i10, context, g6Var, false);
        this.f25978n0 = tiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f25978n0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f25978n0.getThemedColor(org.telegram.ui.ActionBar.k6.S5);
    }
}
