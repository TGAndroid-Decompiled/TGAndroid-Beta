package org.telegram.ui.Components;

import android.os.Bundle;
public final class at0 extends org.telegram.ui.sn {
    public boolean f24802ed;
    public final int f24803fd;
    public final wv0 f24804gd;

    public at0(wv0 wv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f24804gd = wv0Var;
        this.f24803fd = i10;
        this.f24802ed = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        wv0 wv0Var = this.f24804gd;
        hv0 hv0Var = wv0Var.S;
        if (this.f24802ed) {
            if (this.f41557j0 != null) {
                qa("");
                this.f41557j0.H(hv0Var.f27182w, false);
            }
            org.telegram.ui.rk rkVar = this.A1;
            if (rkVar != null) {
                rkVar.e(hv0Var.f27183x, false);
            }
            wv0Var.f32410v1.getMediaDataController().portSavedSearchResults(getClassGuid(), hv0Var.f27183x, hv0Var.f27182w, hv0Var.f27179n, hv0Var.h, this.f24803fd, hv0Var.v, hv0Var.f27181s);
            this.f24802ed = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
