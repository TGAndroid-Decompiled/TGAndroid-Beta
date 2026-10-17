package org.telegram.ui;

import android.content.Context;
public final class bj0 extends ei.d {
    public final dj0 f35700h0;

    public bj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f35700h0 = dj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        dj0 dj0Var = this.f35700h0;
        if (dj0Var.f36222n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        dj0Var.f36222n0 = f7;
        if (z10) {
            dj0Var.f36223o0 = new org.telegram.ui.Components.mb0(dj0Var, 1);
            dj0Var.T(false);
        }
        return f7;
    }
}
