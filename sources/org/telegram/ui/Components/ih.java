package org.telegram.ui.Components;

import android.content.Context;
public final class ih extends zf {
    public final bi f27093n0;

    public ih(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(2131232691, context, p6Var, false);
        this.f27093n0 = biVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e() {
        return !this.f27093n0.O2;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.S5, this.f27093n0.I0);
    }
}
