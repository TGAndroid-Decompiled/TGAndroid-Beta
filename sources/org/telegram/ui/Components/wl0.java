package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class wl0 extends vr {
    public final org.telegram.ui.cw f40027l0;

    public wl0(org.telegram.ui.cw cwVar, tj0 tj0Var, Context context, int i3, int i10) {
        super(tj0Var, context, i3, i10, false, null);
        this.f40027l0 = cwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        vl0 vl0Var = this.f40027l0.f34760o0;
        if (!this.f39771c0 && !this.f39772d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        vl0Var.e(z11, z10);
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.f41128e.setVisibility(8);
    }
}
