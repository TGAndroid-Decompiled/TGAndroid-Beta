package org.telegram.ui.Components;

import android.os.Bundle;
public final class ns0 extends org.telegram.ui.zn {
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
            if (this.f40355j0 != null) {
                la("");
                this.f40355j0.H(uu0Var.f28862w, false);
            }
            org.telegram.ui.xk xkVar = this.f40416o1;
            if (xkVar != null) {
                xkVar.e(uu0Var.f28863x, false);
            }
            jv0Var.f25528v1.getMediaDataController().portSavedSearchResults(getClassGuid(), uu0Var.f28863x, uu0Var.f28862w, uu0Var.f28859n, uu0Var.h, this.Qc, uu0Var.v, uu0Var.f28861s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
