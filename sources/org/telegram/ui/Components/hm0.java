package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class hm0 extends hs {
    public final org.telegram.ui.jw f35772l0;

    public hm0(org.telegram.ui.jw jwVar, ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, i10, false, null);
        this.f35772l0 = jwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        gm0 gm0Var = this.f35772l0.f40094o0;
        if (!this.f35804c0 && !this.f35805d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        gm0Var.e(z11, z10);
        gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var.f37553e.setVisibility(8);
    }
}
