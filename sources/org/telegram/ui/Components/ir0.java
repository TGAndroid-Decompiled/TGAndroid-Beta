package org.telegram.ui.Components;

import android.os.Bundle;
public final class ir0 extends org.telegram.ui.qn {
    public boolean Mc;
    public final int Nc;
    public final eu0 Oc;

    public ir0(eu0 eu0Var, Bundle bundle, int i9) {
        super(bundle);
        this.Oc = eu0Var;
        this.Nc = i9;
        this.Mc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        eu0 eu0Var = this.Oc;
        pt0 pt0Var = eu0Var.O;
        if (this.Mc) {
            if (this.f41904f0 != null) {
                la("");
                this.f41904f0.H(pt0Var.f31758w, false);
            }
            org.telegram.ui.mk mkVar = this.f41967k1;
            if (mkVar != null) {
                mkVar.e(pt0Var.f31759x, false);
            }
            eu0Var.f28160r1.getMediaDataController().portSavedSearchResults(getClassGuid(), pt0Var.f31759x, pt0Var.f31758w, pt0Var.f31755n, pt0Var.h, this.Nc, pt0Var.v, pt0Var.f31757s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
