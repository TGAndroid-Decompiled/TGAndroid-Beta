package org.telegram.ui.Components;

import android.os.Bundle;
public final class ds0 extends org.telegram.ui.bo {
    public boolean Qc;
    public final int Rc;
    public final zu0 Sc;

    public ds0(zu0 zu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = zu0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        zu0 zu0Var = this.Sc;
        ku0 ku0Var = zu0Var.S;
        if (this.Qc) {
            if (this.f32327j0 != null) {
                la("");
                this.f32327j0.H(ku0Var.f25690w, false);
            }
            org.telegram.ui.zk zkVar = this.f32388o1;
            if (zkVar != null) {
                zkVar.e(ku0Var.f25691x, false);
            }
            zu0Var.f30656v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ku0Var.f25691x, ku0Var.f25690w, ku0Var.f25687n, ku0Var.h, this.Rc, ku0Var.v, ku0Var.f25689s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
