package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class ul0 extends vr {
    public final org.telegram.ui.hw f38749k0;

    public ul0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7, int i10) {
        super(qj0Var, context, i7, i10, false, null);
        this.f38749k0 = hwVar;
    }

    @Override
    public final void O(boolean z9) {
        boolean z10;
        ArrayList arrayList;
        super.O(z9);
        tl0 tl0Var = this.f38749k0.f34004n0;
        if (!this.f39792b0 && !this.f39793c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        tl0Var.e(z10, z9);
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.f32768e.setVisibility(8);
    }
}
