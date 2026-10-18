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
            if (this.f41277j0 != null) {
                qa("");
                this.f41277j0.H(dv0Var.f25724w, false);
            }
            org.telegram.ui.sk skVar = this.f41341o1;
            if (skVar != null) {
                skVar.e(dv0Var.f25725x, false);
            }
            sv0Var.f30395v1.getMediaDataController().portSavedSearchResults(getClassGuid(), dv0Var.f25725x, dv0Var.f25724w, dv0Var.f25721n, dv0Var.h, this.Rc, dv0Var.v, dv0Var.f25723s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
