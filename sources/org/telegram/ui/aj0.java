package org.telegram.ui;

import android.content.Context;
public final class aj0 extends fi.d {
    public final cj0 f37814k0;

    public aj0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, true);
        this.f37814k0 = cj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        cj0 cj0Var = this.f37814k0;
        if (cj0Var.f38484n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        cj0Var.f38484n0 = f7;
        if (z10) {
            cj0Var.f38485o0 = new org.telegram.ui.Components.kb0(cj0Var, 1);
            cj0Var.S(false);
        }
        return f7;
    }
}
