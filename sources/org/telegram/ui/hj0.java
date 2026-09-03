package org.telegram.ui;

import android.content.Context;
public final class hj0 extends ph.d {
    public final jj0 f34686e0;

    public hj0(jj0 jj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true);
        this.f34686e0 = jj0Var;
    }

    @Override
    public final float a(float f10, float f11) {
        boolean z4;
        jj0 jj0Var = this.f34686e0;
        if (jj0Var.f35308k0 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        jj0Var.f35308k0 = f10;
        if (z4) {
            jj0Var.f35309l0 = new gg.o2(jj0Var, 2);
            jj0Var.S(false);
        }
        return f10;
    }
}
