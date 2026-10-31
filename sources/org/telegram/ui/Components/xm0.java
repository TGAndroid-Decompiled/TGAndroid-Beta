package org.telegram.ui.Components;

import android.content.Context;
public final class xm0 extends m30 {
    public final org.telegram.ui.kx f32510e0;

    public xm0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10) {
        super(tk0Var, context, i10);
        this.f32510e0 = kxVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        tm0 tm0Var = this.f32510e0.f26467u0;
        tm0Var.e(false, z10);
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
    }
}
