package org.telegram.ui;

import android.content.Context;
public final class jj0 extends ci.d {
    public final lj0 f34803h0;

    public jj0(lj0 lj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f34803h0 = lj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        lj0 lj0Var = this.f34803h0;
        if (lj0Var.f35360n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        lj0Var.f35360n0 = f7;
        if (z10) {
            lj0Var.f35361o0 = new org.telegram.ui.Components.db0(lj0Var, 1);
            lj0Var.S(false);
        }
        return f7;
    }
}
