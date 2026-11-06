package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class am0 extends xr {
    public final org.telegram.ui.ww f31854f0;
    public final org.telegram.ui.fw f31855g0;

    public am0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7, int i10, org.telegram.ui.ww wwVar) {
        super(pj0Var, context, i7, i10);
        this.f31855g0 = fwVar;
        this.f31854f0 = wwVar;
    }

    @Override
    public final void O(boolean z9) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z9);
        sl0 sl0Var = this.f31855g0.f33596i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sl0Var.e(z10, z9);
        if (TextUtils.isEmpty(this.f40360d0)) {
            sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748230, null));
            sl0Var.f31925e.setVisibility(0);
            sl0Var.f31925e.setText(org.telegram.messenger.hd.M0(2131748231, null));
            return;
        }
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.f31925e.setVisibility(8);
    }
}
