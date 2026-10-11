package org.telegram.ui.Components;

import android.os.Bundle;
public final class gt0 extends org.telegram.ui.zn {
    public boolean Qc;
    public final int Rc;
    public final cw0 Sc;

    public gt0(cw0 cw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = cw0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        cw0 cw0Var = this.Sc;
        nv0 nv0Var = cw0Var.S;
        if (this.Qc) {
            if (this.f44847j0 != null) {
                qa("");
                this.f44847j0.H(nv0Var.f29299w, false);
            }
            org.telegram.ui.zk zkVar = this.f44908o1;
            if (zkVar != null) {
                zkVar.e(nv0Var.f29300x, false);
            }
            cw0Var.f25536v1.getMediaDataController().portSavedSearchResults(getClassGuid(), nv0Var.f29300x, nv0Var.f29299w, nv0Var.f29296n, nv0Var.h, this.Rc, nv0Var.v, nv0Var.f29298s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
