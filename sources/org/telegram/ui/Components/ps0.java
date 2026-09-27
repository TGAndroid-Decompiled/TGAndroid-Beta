package org.telegram.ui.Components;

import android.os.Bundle;
public final class ps0 extends org.telegram.ui.xn {
    public boolean Pc;
    public final int Qc;
    public final lv0 Rc;

    public ps0(lv0 lv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = lv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        lv0 lv0Var = this.Rc;
        wu0 wu0Var = lv0Var.S;
        if (this.Pc) {
            if (this.f39802j0 != null) {
                la("");
                this.f39802j0.H(wu0Var.f30187w, false);
            }
            org.telegram.ui.xk xkVar = this.f39863o1;
            if (xkVar != null) {
                xkVar.e(wu0Var.f30188x, false);
            }
            lv0Var.f26212v1.getMediaDataController().portSavedSearchResults(getClassGuid(), wu0Var.f30188x, wu0Var.f30187w, wu0Var.f30184n, wu0Var.h, this.Qc, wu0Var.v, wu0Var.f30186s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
