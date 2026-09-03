package org.telegram.ui.Components;

import android.content.Context;
public final class vh extends lg {
    public final mi f31887i0;

    public vh(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(i10, context, g6Var, false);
        this.f31887i0 = miVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f31887i0.R0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f31887i0.getThemedColor(org.telegram.ui.ActionBar.k6.S5);
    }
}
