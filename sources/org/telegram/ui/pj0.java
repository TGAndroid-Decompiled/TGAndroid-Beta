package org.telegram.ui;

import android.content.Context;
public final class pj0 extends ci.d {
    public final rj0 f40925h0;

    public pj0(rj0 rj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f40925h0 = rj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        rj0 rj0Var = this.f40925h0;
        if (rj0Var.f41498n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        rj0Var.f41498n0 = f7;
        if (z10) {
            rj0Var.f41499o0 = new org.telegram.ui.Components.tb0(rj0Var, 1);
            rj0Var.T(false);
        }
        return f7;
    }
}
