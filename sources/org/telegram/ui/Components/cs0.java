package org.telegram.ui.Components;

import android.os.Bundle;
public final class cs0 extends org.telegram.ui.xn {
    public boolean Nc;
    public final int Oc;
    public final zu0 Pc;

    public cs0(zu0 zu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Pc = zu0Var;
        this.Oc = i10;
        this.Nc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        zu0 zu0Var = this.Pc;
        ku0 ku0Var = zu0Var.P;
        if (this.Nc) {
            if (this.f43191g0 != null) {
                la("");
                this.f43191g0.H(ku0Var.f28458w, false);
            }
            org.telegram.ui.vk vkVar = this.l1;
            if (vkVar != null) {
                vkVar.e(ku0Var.f28459x, false);
            }
            zu0Var.f34004s1.getMediaDataController().portSavedSearchResults(getClassGuid(), ku0Var.f28459x, ku0Var.f28458w, ku0Var.f28455n, ku0Var.h, this.Oc, ku0Var.v, ku0Var.f28457s);
            this.Nc = false;
        }
        super.onTransitionAnimationStart(z4, z10);
    }
}
