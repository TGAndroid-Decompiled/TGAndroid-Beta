package org.telegram.ui;

import android.content.Context;
public final class cj0 extends fi.d {
    public final ej0 f38374k0;

    public cj0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, true);
        this.f38374k0 = ej0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        ej0 ej0Var = this.f38374k0;
        if (ej0Var.f38898n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ej0Var.f38898n0 = f7;
        if (z10) {
            ej0Var.f38899o0 = new org.telegram.ui.Components.lb0(ej0Var, 1);
            ej0Var.S(false);
        }
        return f7;
    }
}
