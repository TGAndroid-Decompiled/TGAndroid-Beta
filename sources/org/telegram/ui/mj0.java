package org.telegram.ui;

import android.content.Context;
public final class mj0 extends ci.d {
    public final oj0 f38661h0;

    public mj0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f38661h0 = oj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        oj0 oj0Var = this.f38661h0;
        if (oj0Var.f39218n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        oj0Var.f39218n0 = f7;
        if (z10) {
            oj0Var.f39219o0 = new org.telegram.ui.Components.fb0(oj0Var, 1);
            oj0Var.Q(false);
        }
        return f7;
    }
}
