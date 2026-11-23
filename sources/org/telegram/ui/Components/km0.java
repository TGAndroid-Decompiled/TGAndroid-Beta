package org.telegram.ui.Components;

import android.content.Context;
public final class km0 extends f30 {
    public final org.telegram.ui.jw f36810f0;

    public km0(org.telegram.ui.jw jwVar, ek0 ek0Var, Context context, int i7) {
        super(ek0Var, context, i7);
        this.f36810f0 = jwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        gm0 gm0Var = this.f36810f0.f40101v0;
        gm0Var.e(false, z10);
        gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var.f37553e.setVisibility(8);
    }
}
