package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class im0 extends ks {
    public final org.telegram.ui.kw f36280l0;

    public im0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, i10, false, null);
        this.f36280l0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        hm0 hm0Var = this.f36280l0.f40511o0;
        if (!this.f36966c0 && !this.f36967d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        hm0Var.e(z11, z10);
        hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var.f37995e.setVisibility(8);
    }
}
