package org.telegram.ui.Components;

import android.os.Bundle;
public final class ns0 extends org.telegram.ui.wn {
    public boolean Pc;
    public final int Qc;
    public final jv0 Rc;

    public ns0(jv0 jv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = jv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jv0 jv0Var = this.Rc;
        uu0 uu0Var = jv0Var.S;
        if (this.Pc) {
            if (this.f39505j0 != null) {
                la("");
                this.f39505j0.H(uu0Var.f28914w, false);
            }
            org.telegram.ui.vk vkVar = this.f39566o1;
            if (vkVar != null) {
                vkVar.e(uu0Var.f28915x, false);
            }
            jv0Var.f25543v1.getMediaDataController().portSavedSearchResults(getClassGuid(), uu0Var.f28915x, uu0Var.f28914w, uu0Var.f28911n, uu0Var.h, this.Qc, uu0Var.v, uu0Var.f28913s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
