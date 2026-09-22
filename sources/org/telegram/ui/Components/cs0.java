package org.telegram.ui.Components;

import android.os.Bundle;
public final class cs0 extends org.telegram.ui.bo {
    public boolean Pc;
    public final int Qc;
    public final yu0 Rc;

    public cs0(yu0 yu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = yu0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        yu0 yu0Var = this.Rc;
        ju0 ju0Var = yu0Var.S;
        if (this.Pc) {
            if (this.f32344j0 != null) {
                la("");
                this.f32344j0.H(ju0Var.f25434w, false);
            }
            org.telegram.ui.yk ykVar = this.f32405o1;
            if (ykVar != null) {
                ykVar.e(ju0Var.f25435x, false);
            }
            yu0Var.f30389v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.f25435x, ju0Var.f25434w, ju0Var.f25431n, ju0Var.h, this.Qc, ju0Var.v, ju0Var.f25433s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
