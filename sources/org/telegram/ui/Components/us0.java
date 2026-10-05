package org.telegram.ui.Components;

import android.os.Bundle;
public final class us0 extends org.telegram.ui.yn {
    public boolean Kc;
    public final int Lc;
    public final qv0 Mc;

    public us0(qv0 qv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Mc = qv0Var;
        this.Lc = i10;
        this.Kc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        qv0 qv0Var = this.Mc;
        bv0 bv0Var = qv0Var.S;
        if (this.Kc) {
            if (this.f43352h0 != null) {
                ka("");
                this.f43352h0.H(bv0Var.f25113w, false);
            }
            org.telegram.ui.vk vkVar = this.f43413m1;
            if (vkVar != null) {
                vkVar.e(bv0Var.f25114x, false);
            }
            qv0Var.f30263v1.getMediaDataController().portSavedSearchResults(getClassGuid(), bv0Var.f25114x, bv0Var.f25113w, bv0Var.f25110n, bv0Var.h, this.Lc, bv0Var.v, bv0Var.f25112s);
            this.Kc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
