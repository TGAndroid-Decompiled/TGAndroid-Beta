package org.telegram.ui.Components;

import android.os.Bundle;
public final class bt0 extends org.telegram.ui.fo {
    public boolean Qc;
    public final int Rc;
    public final xv0 Sc;

    public bt0(xv0 xv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = xv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xv0 xv0Var = this.Sc;
        iv0 iv0Var = xv0Var.S;
        if (this.Qc) {
            if (this.f35983j0 != null) {
                qa("");
                this.f35983j0.H(iv0Var.f26113w, false);
            }
            org.telegram.ui.dl dlVar = this.f36047o1;
            if (dlVar != null) {
                dlVar.e(iv0Var.f26114x, false);
            }
            xv0Var.f31388v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iv0Var.f26114x, iv0Var.f26113w, iv0Var.f26110n, iv0Var.h, this.Rc, iv0Var.v, iv0Var.f26112s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
