package org.telegram.ui.Components;

import android.content.Context;
public final class yh extends og {
    public final ni f35064h0;

    public yh(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(i10, context, c6Var, false);
        this.f35064h0 = niVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f35064h0.Q0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f35064h0.getThemedColor(org.telegram.ui.ActionBar.g6.S5);
    }
}
