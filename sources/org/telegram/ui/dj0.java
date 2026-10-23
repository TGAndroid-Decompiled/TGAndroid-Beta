package org.telegram.ui;

import android.content.Context;
public final class dj0 extends ei.d {
    public final fj0 f36648k0;

    public dj0(fj0 fj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true);
        this.f36648k0 = fj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        fj0 fj0Var = this.f36648k0;
        if (fj0Var.f37357n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        fj0Var.f37357n0 = f7;
        if (z10) {
            fj0Var.f37358o0 = new org.telegram.ui.Components.nb0(fj0Var, 1);
            fj0Var.S(false);
        }
        return f7;
    }
}
