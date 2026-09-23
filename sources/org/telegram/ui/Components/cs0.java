package org.telegram.ui.Components;

import android.os.Bundle;
public final class cs0 extends org.telegram.ui.xn {
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
            if (this.f39421j0 != null) {
                la("");
                this.f39421j0.H(ju0Var.f25415w, false);
            }
            org.telegram.ui.vk vkVar = this.f39482o1;
            if (vkVar != null) {
                vkVar.e(ju0Var.f25416x, false);
            }
            yu0Var.f30450v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.f25416x, ju0Var.f25415w, ju0Var.f25412n, ju0Var.h, this.Qc, ju0Var.v, ju0Var.f25414s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
