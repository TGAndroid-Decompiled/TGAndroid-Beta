package org.telegram.ui.Components;

import android.content.Context;

public final class rh extends hg {

    public final gi f32168h0;

    public rh(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(i10, context, c6Var, false);
        this.f32168h0 = giVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f32168h0.Q0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f32168h0.getThemedColor(org.telegram.ui.ActionBar.g6.S5);
    }
}
