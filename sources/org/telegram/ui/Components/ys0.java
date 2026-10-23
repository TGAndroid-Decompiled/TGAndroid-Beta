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
            if (this.f40728j0 != null) {
                qa("");
                this.f40728j0.H(fv0Var.f26429w, false);
            }
            org.telegram.ui.qk qkVar = this.f40792o1;
            if (qkVar != null) {
                qkVar.e(fv0Var.f26430x, false);
            }
            uv0Var.f31075v1.getMediaDataController().portSavedSearchResults(getClassGuid(), fv0Var.f26430x, fv0Var.f26429w, fv0Var.f26426n, fv0Var.h, this.Sc, fv0Var.v, fv0Var.f26428s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
