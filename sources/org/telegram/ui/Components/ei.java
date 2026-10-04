package org.telegram.ui.Components;

import android.content.Context;
public final class ei extends wg {
    public final xi f26072l0;

    public ei(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(i10, context, d6Var, false);
        this.f26072l0 = xiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f26072l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f26072l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
