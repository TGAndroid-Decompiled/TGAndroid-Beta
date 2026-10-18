package org.telegram.ui.Components;

import android.content.Context;
public final class ei extends vg {
    public final ti f25923l0;

    public ei(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(i10, context, d6Var, false);
        this.f25923l0 = tiVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f25923l0.X0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f25923l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
