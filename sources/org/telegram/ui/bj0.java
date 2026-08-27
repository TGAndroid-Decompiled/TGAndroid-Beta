package org.telegram.ui;

import android.content.Context;

public final class bj0 extends lh.d {

    public final dj0 f36844d0;

    public bj0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true);
        this.f36844d0 = dj0Var;
    }

    @Override
    public final float a(float f10, float f11) {
        dj0 dj0Var = this.f36844d0;
        boolean z10 = dj0Var.f37426j0 == 0.0f;
        dj0Var.f37426j0 = f10;
        if (z10) {
            dj0Var.f37427k0 = new cg.r2(dj0Var, 2);
            dj0Var.S(false);
        }
        return f10;
    }
}
