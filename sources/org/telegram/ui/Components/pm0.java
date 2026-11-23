package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class pm0 extends ms {
    public final org.telegram.ui.cx f38638g0;
    public final org.telegram.ui.kw f38639h0;

    public pm0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7, int i10, org.telegram.ui.cx cxVar) {
        super(ek0Var, context, i7, i10);
        this.f38639h0 = kwVar;
        this.f38638g0 = cxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        hm0 hm0Var = this.f38639h0.f40508j0;
        if (!this.Z && !this.f37622a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        hm0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f37626e0)) {
            hm0Var.d.setText(org.telegram.messenger.hd.N0(2131748038, null));
            hm0Var.f37996e.setVisibility(0);
            hm0Var.f37996e.setText(org.telegram.messenger.hd.N0(2131748039, null));
            return;
        }
        hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var.f37996e.setVisibility(8);
    }
}
