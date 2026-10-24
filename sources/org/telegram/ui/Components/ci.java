package org.telegram.ui.Components;

import android.content.Context;
public final class ci extends tg {
    public final ri f25336n0;

    public ci(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, ri riVar) {
        super(i10, context, g6Var, false);
        this.f25336n0 = riVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f25336n0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f25336n0.getThemedColor(org.telegram.ui.ActionBar.k6.S5);
    }
}
