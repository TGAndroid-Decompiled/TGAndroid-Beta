package org.telegram.ui.Components;

import android.content.Context;
public final class di extends vg {
    public final wi f23668l0;

    public di(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, wi wiVar) {
        super(i10, context, e6Var, false);
        this.f23668l0 = wiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f23668l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f23668l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
