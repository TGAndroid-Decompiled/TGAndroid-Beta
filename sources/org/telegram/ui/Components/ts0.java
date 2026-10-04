package org.telegram.ui.Components;

import android.os.Bundle;
public final class ts0 extends org.telegram.ui.yn {
    public boolean Kc;
    public final int Lc;
    public final pv0 Mc;

    public ts0(pv0 pv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Mc = pv0Var;
        this.Lc = i10;
        this.Kc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        pv0 pv0Var = this.Mc;
        av0 av0Var = pv0Var.S;
        if (this.Kc) {
            if (this.f43359h0 != null) {
                ka("");
                this.f43359h0.H(av0Var.f24686w, false);
            }
            org.telegram.ui.vk vkVar = this.f43420m1;
            if (vkVar != null) {
                vkVar.e(av0Var.f24687x, false);
            }
            pv0Var.f29806v1.getMediaDataController().portSavedSearchResults(getClassGuid(), av0Var.f24687x, av0Var.f24686w, av0Var.f24683n, av0Var.h, this.Lc, av0Var.v, av0Var.f24685s);
            this.Kc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
