package org.telegram.ui.Components;

import android.os.Bundle;
public final class qs0 extends org.telegram.ui.wn {
    public boolean Pc;
    public final int Qc;
    public final mv0 Rc;

    public qs0(mv0 mv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = mv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        mv0 mv0Var = this.Rc;
        xu0 xu0Var = mv0Var.S;
        if (this.Pc) {
            if (this.f39613j0 != null) {
                la("");
                this.f39613j0.H(xu0Var.f30512w, false);
            }
            org.telegram.ui.vk vkVar = this.f39674o1;
            if (vkVar != null) {
                vkVar.e(xu0Var.f30513x, false);
            }
            mv0Var.f26449v1.getMediaDataController().portSavedSearchResults(getClassGuid(), xu0Var.f30513x, xu0Var.f30512w, xu0Var.f30509n, xu0Var.h, this.Qc, xu0Var.v, xu0Var.f30511s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
