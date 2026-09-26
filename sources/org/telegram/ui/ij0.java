package org.telegram.ui;

import android.content.Context;
public final class ij0 extends ci.d {
    public final kj0 f34537h0;

    public ij0(kj0 kj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, true);
        this.f34537h0 = kj0Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        kj0 kj0Var = this.f34537h0;
        if (kj0Var.f35091n0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        kj0Var.f35091n0 = f7;
        if (z10) {
            kj0Var.f35092o0 = new org.telegram.ui.Components.db0(kj0Var, 1);
            kj0Var.S(false);
        }
        return f7;
    }
}
