package org.telegram.ui;

import android.content.Context;
public final class gj0 extends qh.d {
    public final ij0 f37119e0;

    public gj0(ij0 ij0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true);
        this.f37119e0 = ij0Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z4;
        ij0 ij0Var = this.f37119e0;
        if (ij0Var.f37729k0 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        ij0Var.f37729k0 = f10;
        if (z4) {
            ij0Var.f37730l0 = new hg.o2(ij0Var, 2);
            ij0Var.S(false);
        }
        return f10;
    }
}
