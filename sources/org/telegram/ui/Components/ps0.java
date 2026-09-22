package org.telegram.ui.Components;

import android.os.Bundle;
public final class ps0 extends org.telegram.ui.zn {
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
            if (this.f40376j0 != null) {
                la("");
                this.f40376j0.H(wu0Var.f30158w, false);
            }
            org.telegram.ui.yk ykVar = this.f40437o1;
            if (ykVar != null) {
                ykVar.e(wu0Var.f30159x, false);
            }
            lv0Var.f26234v1.getMediaDataController().portSavedSearchResults(getClassGuid(), wu0Var.f30159x, wu0Var.f30158w, wu0Var.f30155n, wu0Var.h, this.Qc, wu0Var.v, wu0Var.f30157s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
