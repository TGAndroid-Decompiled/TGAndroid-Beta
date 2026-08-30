package org.telegram.ui.Components;

import android.os.Bundle;
public final class bs0 extends org.telegram.ui.xn {
    public boolean Nc;
    public final int Oc;
    public final yu0 Pc;

    public bs0(yu0 yu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Pc = yu0Var;
        this.Oc = i10;
        this.Nc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        yu0 yu0Var = this.Pc;
        ju0 ju0Var = yu0Var.P;
        if (this.Nc) {
            if (this.f40022g0 != null) {
                la("");
                this.f40022g0.H(ju0Var.f26045w, false);
            }
            org.telegram.ui.vk vkVar = this.l1;
            if (vkVar != null) {
                vkVar.e(ju0Var.f26046x, false);
            }
            yu0Var.f31144s1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.f26046x, ju0Var.f26045w, ju0Var.f26042n, ju0Var.h, this.Oc, ju0Var.v, ju0Var.f26044s);
            this.Nc = false;
        }
        super.onTransitionAnimationStart(z4, z10);
    }
}
