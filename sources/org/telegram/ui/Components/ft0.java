package org.telegram.ui.Components;

import android.os.Bundle;
public final class ft0 extends org.telegram.ui.zn {
    public boolean Qc;
    public final int Rc;
    public final bw0 Sc;

    public ft0(bw0 bw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = bw0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        bw0 bw0Var = this.Sc;
        mv0 mv0Var = bw0Var.S;
        if (this.Qc) {
            if (this.f44812j0 != null) {
                qa("");
                this.f44812j0.H(mv0Var.f28960w, false);
            }
            org.telegram.ui.zk zkVar = this.f44873o1;
            if (zkVar != null) {
                zkVar.e(mv0Var.f28961x, false);
            }
            bw0Var.f25166v1.getMediaDataController().portSavedSearchResults(getClassGuid(), mv0Var.f28961x, mv0Var.f28960w, mv0Var.f28957n, mv0Var.h, this.Rc, mv0Var.v, mv0Var.f28959s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
