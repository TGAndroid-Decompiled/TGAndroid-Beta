package org.telegram.ui.Components;

import android.content.Context;
public final class ym0 extends m30 {
    public final org.telegram.ui.jx f32876e0;

    public ym0(org.telegram.ui.jx jxVar, uk0 uk0Var, Context context, int i10) {
        super(uk0Var, context, i10);
        this.f32876e0 = jxVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        um0 um0Var = this.f32876e0.f26888u0;
        um0Var.e(false, z10);
        um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var.e.setVisibility(8);
    }
}
