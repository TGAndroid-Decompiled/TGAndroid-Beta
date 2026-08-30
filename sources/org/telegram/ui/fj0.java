package org.telegram.ui;

import android.content.Context;
public final class fj0 extends ph.d {
    public final hj0 f34270e0;

    public fj0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f34270e0 = hj0Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z4;
        hj0 hj0Var = this.f34270e0;
        if (hj0Var.f34901k0 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        hj0Var.f34901k0 = f10;
        if (z4) {
            hj0Var.f34902l0 = new gg.o2(hj0Var, 2);
            hj0Var.S(false);
        }
        return f10;
    }
}
