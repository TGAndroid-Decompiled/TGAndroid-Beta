package org.telegram.ui.Components;

import android.os.Bundle;
public final class lt0 extends org.telegram.ui.eo {
    public boolean Qc;
    public final int Rc;
    public final hw0 Sc;

    public lt0(hw0 hw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = hw0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        hw0 hw0Var = this.Sc;
        sv0 sv0Var = hw0Var.S;
        if (this.Qc) {
            if (this.f37302j0 != null) {
                qa("");
                this.f37302j0.H(sv0Var.f30693w, false);
            }
            org.telegram.ui.dl dlVar = this.f37363o1;
            if (dlVar != null) {
                dlVar.e(sv0Var.f30694x, false);
            }
            hw0Var.f26972v1.getMediaDataController().portSavedSearchResults(getClassGuid(), sv0Var.f30694x, sv0Var.f30693w, sv0Var.f30690n, sv0Var.h, this.Rc, sv0Var.v, sv0Var.f30692s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
