package org.telegram.ui;

import android.content.Context;
public final class lj0 extends ci.d {
    public final nj0 f35364h0;

    public lj0(nj0 nj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, true);
        this.f35364h0 = nj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        nj0 nj0Var = this.f35364h0;
        if (nj0Var.f36035n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        nj0Var.f36035n0 = f7;
        if (z10) {
            nj0Var.f36036o0 = new org.telegram.ui.Components.eb0(nj0Var, 1);
            nj0Var.S(false);
        }
        return f7;
    }
}
