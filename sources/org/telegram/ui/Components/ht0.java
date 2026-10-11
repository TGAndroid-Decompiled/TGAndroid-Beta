package org.telegram.ui.Components;

import android.os.Bundle;
public final class ht0 extends org.telegram.ui.zn {
    public boolean Qc;
    public final int Rc;
    public final dw0 Sc;

    public ht0(dw0 dw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = dw0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        dw0 dw0Var = this.Sc;
        ov0 ov0Var = dw0Var.S;
        if (this.Qc) {
            if (this.f44813j0 != null) {
                qa("");
                this.f44813j0.H(ov0Var.f29538w, false);
            }
            org.telegram.ui.zk zkVar = this.f44874o1;
            if (zkVar != null) {
                zkVar.e(ov0Var.f29539x, false);
            }
            dw0Var.f25735v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ov0Var.f29539x, ov0Var.f29538w, ov0Var.f29535n, ov0Var.h, this.Rc, ov0Var.v, ov0Var.f29537s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
