package org.telegram.ui.Components;

import android.content.Context;
public final class fi extends ug {
    public final vi f24231l0;

    public fi(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(i10, context, f6Var, false);
        this.f24231l0 = viVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f24231l0.U0;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f24231l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
