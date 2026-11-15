package org.telegram.ui.Components;

import android.content.Context;
public final class am0 extends x20 {
    public final org.telegram.ui.hw f33024f0;

    public am0(org.telegram.ui.hw hwVar, uj0 uj0Var, Context context, int i7) {
        super(uj0Var, context, i7);
        this.f33024f0 = hwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        wl0 wl0Var = this.f33024f0.f36056v0;
        wl0Var.e(false, z10);
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.f33709e.setVisibility(8);
    }
}
