package org.telegram.ui.Components;

import android.os.Bundle;
public final class ws0 extends org.telegram.ui.sn {
    public boolean Qc;
    public final int Rc;
    public final sv0 Sc;

    public ws0(sv0 sv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = sv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        sv0 sv0Var = this.Sc;
        dv0 dv0Var = sv0Var.S;
        if (this.Qc) {
            if (this.f41256j0 != null) {
                qa("");
                this.f41256j0.H(dv0Var.f25717w, false);
            }
            org.telegram.ui.sk skVar = this.f41320o1;
            if (skVar != null) {
                skVar.e(dv0Var.f25718x, false);
            }
            sv0Var.f30388v1.getMediaDataController().portSavedSearchResults(getClassGuid(), dv0Var.f25718x, dv0Var.f25717w, dv0Var.f25714n, dv0Var.h, this.Rc, dv0Var.v, dv0Var.f25716s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
