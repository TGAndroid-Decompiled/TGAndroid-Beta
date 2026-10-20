package org.telegram.ui.Components;

import android.os.Bundle;
public final class ys0 extends org.telegram.ui.qn {
    public boolean Rc;
    public final int Sc;
    public final uv0 Tc;

    public ys0(uv0 uv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Tc = uv0Var;
        this.Sc = i10;
        this.Rc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        uv0 uv0Var = this.Tc;
        fv0 fv0Var = uv0Var.S;
        if (this.Rc) {
            if (this.f40724j0 != null) {
                qa("");
                this.f40724j0.H(fv0Var.f26425w, false);
            }
            org.telegram.ui.qk qkVar = this.f40788o1;
            if (qkVar != null) {
                qkVar.e(fv0Var.f26426x, false);
            }
            uv0Var.f31070v1.getMediaDataController().portSavedSearchResults(getClassGuid(), fv0Var.f26426x, fv0Var.f26425w, fv0Var.f26422n, fv0Var.h, this.Sc, fv0Var.v, fv0Var.f26424s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
