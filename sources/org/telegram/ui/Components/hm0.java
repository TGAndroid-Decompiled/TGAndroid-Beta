package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class hm0 extends ks {
    public final org.telegram.ui.kw f35894l0;

    public hm0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, i10, false, null);
        this.f35894l0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        gm0 gm0Var = this.f35894l0.f39914o0;
        if (!this.f36934c0 && !this.f36935d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        gm0Var.e(z11, z10);
        gm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        gm0Var.f37962e.setVisibility(8);
    }
}
