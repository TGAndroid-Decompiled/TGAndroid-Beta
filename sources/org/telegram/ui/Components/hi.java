package org.telegram.ui.Components;

import android.content.Context;
public final class hi extends wg {
    public final xi f24870l0;

    public hi(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(i10, context, d6Var, false);
        this.f24870l0 = xiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f24870l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f24870l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
