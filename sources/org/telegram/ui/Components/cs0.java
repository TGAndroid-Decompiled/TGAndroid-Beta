package org.telegram.ui.Components;

import android.os.Bundle;
public final class cs0 extends org.telegram.ui.bo {
    public boolean Qc;
    public final int Rc;
    public final yu0 Sc;

    public cs0(yu0 yu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = yu0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        yu0 yu0Var = this.Sc;
        ju0 ju0Var = yu0Var.S;
        if (this.Qc) {
            if (this.f32349j0 != null) {
                la("");
                this.f32349j0.H(ju0Var.f25437w, false);
            }
            org.telegram.ui.yk ykVar = this.f32410o1;
            if (ykVar != null) {
                ykVar.e(ju0Var.f25438x, false);
            }
            yu0Var.f30392v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.f25438x, ju0Var.f25437w, ju0Var.f25434n, ju0Var.h, this.Rc, ju0Var.v, ju0Var.f25436s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
