package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class vm0 extends gs {
    public final org.telegram.ui.jx f31347k0;

    public vm0(org.telegram.ui.jx jxVar, uk0 uk0Var, Context context, int i10, int i11) {
        super(uk0Var, context, i10, i11, false, null);
        this.f31347k0 = jxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        um0 um0Var = this.f31347k0.f26881n0;
        if (!this.f26534b0 && !this.f26535c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        um0Var.e(z11, z10);
        um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var.e.setVisibility(8);
    }
}
