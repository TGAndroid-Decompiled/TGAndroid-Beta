package org.telegram.ui.Components;

import android.os.Bundle;
public final class ls0 extends org.telegram.ui.eo {
    public boolean Qc;
    public final int Rc;
    public final iv0 Sc;

    public ls0(iv0 iv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = iv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        iv0 iv0Var = this.Sc;
        tu0 tu0Var = iv0Var.S;
        if (this.Qc) {
            if (this.f32367j0 != null) {
                la("");
                this.f32367j0.H(tu0Var.f27492w, false);
            }
            org.telegram.ui.al alVar = this.f32428o1;
            if (alVar != null) {
                alVar.e(tu0Var.f27493x, false);
            }
            iv0Var.f24131v1.getMediaDataController().portSavedSearchResults(getClassGuid(), tu0Var.f27493x, tu0Var.f27492w, tu0Var.f27489n, tu0Var.h, this.Rc, tu0Var.v, tu0Var.f27491s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
