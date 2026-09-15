package org.telegram.ui.Components;

import android.content.Context;
public final class fi extends tg {
    public final vi f23947l0;

    public fi(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(i10, context, e6Var, false);
        this.f23947l0 = viVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f23947l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f23947l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
