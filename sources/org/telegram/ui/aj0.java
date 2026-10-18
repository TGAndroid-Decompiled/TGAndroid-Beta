package org.telegram.ui;

import android.content.Context;
public final class aj0 extends ei.d {
    public final cj0 f35433h0;

    public aj0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f35433h0 = cj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        cj0 cj0Var = this.f35433h0;
        if (cj0Var.f35928n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cj0Var.f35928n0 = f7;
        if (z10) {
            cj0Var.f35929o0 = new org.telegram.ui.Components.mb0(cj0Var, 1);
            cj0Var.T(false);
        }
        return f7;
    }
}
