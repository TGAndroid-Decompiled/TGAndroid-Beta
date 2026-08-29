package org.telegram.ui.Components;

import android.os.Bundle;
public final class tr0 extends org.telegram.ui.tn {
    public boolean Mc;
    public final int Nc;
    public final qu0 Oc;

    public tr0(qu0 qu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Oc = qu0Var;
        this.Nc = i10;
        this.Mc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        qu0 qu0Var = this.Oc;
        bu0 bu0Var = qu0Var.O;
        if (this.Mc) {
            if (this.f42802f0 != null) {
                la("");
                this.f42802f0.H(bu0Var.f27233w, false);
            }
            org.telegram.ui.pk pkVar = this.f42865k1;
            if (pkVar != null) {
                pkVar.e(bu0Var.f27234x, false);
            }
            qu0Var.f32093r1.getMediaDataController().portSavedSearchResults(getClassGuid(), bu0Var.f27234x, bu0Var.f27233w, bu0Var.f27230n, bu0Var.h, this.Nc, bu0Var.v, bu0Var.f27232s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
