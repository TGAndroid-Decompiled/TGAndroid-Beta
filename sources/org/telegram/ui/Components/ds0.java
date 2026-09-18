package org.telegram.ui.Components;

import android.os.Bundle;
public final class ds0 extends org.telegram.ui.bo {
    public boolean Pc;
    public final int Qc;
    public final zu0 Rc;

    public ds0(zu0 zu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = zu0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        zu0 zu0Var = this.Rc;
        ku0 ku0Var = zu0Var.S;
        if (this.Pc) {
            if (this.f32331j0 != null) {
                la("");
                this.f32331j0.H(ku0Var.f25693w, false);
            }
            org.telegram.ui.zk zkVar = this.f32392o1;
            if (zkVar != null) {
                zkVar.e(ku0Var.f25694x, false);
            }
            zu0Var.f30659v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ku0Var.f25694x, ku0Var.f25693w, ku0Var.f25690n, ku0Var.h, this.Qc, ku0Var.v, ku0Var.f25692s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
