package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class tl0 extends ur {
    public final org.telegram.ui.iw f38337k0;

    public tl0(org.telegram.ui.iw iwVar, pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, i10, false, null);
        this.f38337k0 = iwVar;
    }

    @Override
    public final void O(boolean z9) {
        boolean z10;
        ArrayList arrayList;
        super.O(z9);
        sl0 sl0Var = this.f38337k0.f33599n0;
        if (!this.f38733b0 && !this.f38734c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sl0Var.e(z10, z9);
        sl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var.f32368e.setVisibility(8);
    }
}
