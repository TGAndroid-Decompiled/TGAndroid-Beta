package org.telegram.ui;

import android.content.Context;
public final class qj0 extends bi.d {
    public final sj0 f36081h0;

    public qj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f36081h0 = sj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        sj0 sj0Var = this.f36081h0;
        if (sj0Var.f36706n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        sj0Var.f36706n0 = f7;
        if (z10) {
            sj0Var.f36707o0 = new org.telegram.ui.Components.bb0(sj0Var, 1);
            sj0Var.S(false);
        }
        return f7;
    }
}
