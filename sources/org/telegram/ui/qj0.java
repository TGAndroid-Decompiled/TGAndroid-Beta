package org.telegram.ui;

import android.content.Context;
public final class qj0 extends ci.d {
    public final sj0 f41136h0;

    public qj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, true);
        this.f41136h0 = sj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        sj0 sj0Var = this.f41136h0;
        if (sj0Var.f41721n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        sj0Var.f41721n0 = f7;
        if (z10) {
            sj0Var.f41722o0 = new org.telegram.ui.Components.tb0(sj0Var, 1);
            sj0Var.T(false);
        }
        return f7;
    }
}
