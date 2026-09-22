package org.telegram.ui;

import android.content.Context;
public final class pj0 extends ci.d {
    public final rj0 f36590h0;

    public pj0(rj0 rj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, true);
        this.f36590h0 = rj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        rj0 rj0Var = this.f36590h0;
        if (rj0Var.f37156n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        rj0Var.f37156n0 = f7;
        if (z10) {
            rj0Var.f37157o0 = new org.telegram.ui.Components.ra0(rj0Var, 1);
            rj0Var.S(false);
        }
        return f7;
    }
}
