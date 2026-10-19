package org.telegram.ui.Components;

import android.os.Bundle;
public final class xs0 extends org.telegram.ui.qn {
    public boolean Rc;
    public final int Sc;
    public final tv0 Tc;

    public xs0(tv0 tv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Tc = tv0Var;
        this.Sc = i10;
        this.Rc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        tv0 tv0Var = this.Tc;
        ev0 ev0Var = tv0Var.S;
        if (this.Rc) {
            if (this.f40718j0 != null) {
                qa("");
                this.f40718j0.H(ev0Var.f26035w, false);
            }
            org.telegram.ui.qk qkVar = this.f40782o1;
            if (qkVar != null) {
                qkVar.e(ev0Var.f26036x, false);
            }
            tv0Var.f30732v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ev0Var.f26036x, ev0Var.f26035w, ev0Var.f26032n, ev0Var.h, this.Sc, ev0Var.v, ev0Var.f26034s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
