package org.telegram.ui.Components;

import android.os.Bundle;
public final class bt0 extends org.telegram.ui.sn {
    public boolean f25146ed;
    public final int f25147fd;
    public final xv0 f25148gd;

    public bt0(xv0 xv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f25148gd = xv0Var;
        this.f25147fd = i10;
        this.f25146ed = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xv0 xv0Var = this.f25148gd;
        iv0 iv0Var = xv0Var.S;
        if (this.f25146ed) {
            if (this.f41560j0 != null) {
                qa("");
                this.f41560j0.H(iv0Var.f27459w, false);
            }
            org.telegram.ui.rk rkVar = this.A1;
            if (rkVar != null) {
                rkVar.e(iv0Var.f27460x, false);
            }
            xv0Var.f32711v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iv0Var.f27460x, iv0Var.f27459w, iv0Var.f27456n, iv0Var.h, this.f25147fd, iv0Var.v, iv0Var.f27458s);
            this.f25146ed = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
