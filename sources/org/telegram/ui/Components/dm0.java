package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class dm0 extends xr {
    public final org.telegram.ui.uw f33164g0;
    public final org.telegram.ui.cw f33165h0;

    public dm0(org.telegram.ui.cw cwVar, tj0 tj0Var, Context context, int i3, int i10, org.telegram.ui.uw uwVar) {
        super(tj0Var, context, i3, i10);
        this.f33165h0 = cwVar;
        this.f33164g0 = uwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        vl0 vl0Var = this.f33165h0.f34756j0;
        if (!this.Z && !this.f40464a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        vl0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f40468e0)) {
            vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748239, null));
            vl0Var.f41128e.setVisibility(0);
            vl0Var.f41128e.setText(org.telegram.messenger.bd.M0(2131748240, null));
            return;
        }
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.f41128e.setVisibility(8);
    }
}
