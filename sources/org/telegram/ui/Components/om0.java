package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class om0 extends js {
    public final org.telegram.ui.bx f38218g0;
    public final org.telegram.ui.jw f38219h0;

    public om0(org.telegram.ui.jw jwVar, ek0 ek0Var, Context context, int i7, int i10, org.telegram.ui.bx bxVar) {
        super(ek0Var, context, i7, i10);
        this.f38219h0 = jwVar;
        this.f38218g0 = bxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        gm0 gm0Var = this.f38219h0.f40090j0;
        if (!this.Z && !this.f36503a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        gm0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f36507e0)) {
            gm0Var.d.setText(org.telegram.messenger.gd.N0(2131748038, null));
            gm0Var.f37553e.setVisibility(0);
            gm0Var.f37553e.setText(org.telegram.messenger.gd.N0(2131748039, null));
            return;
        }
        gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var.f37553e.setVisibility(8);
    }
}
