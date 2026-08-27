package org.telegram.ui.Components;

import android.os.Bundle;

public final class jr0 extends org.telegram.ui.rn {
    public boolean Mc;
    public final int Nc;
    public final hu0 Oc;

    public jr0(hu0 hu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Oc = hu0Var;
        this.Nc = i10;
        this.Mc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        hu0 hu0Var = this.Oc;
        st0 st0Var = hu0Var.O;
        if (this.Mc) {
            if (this.f42040f0 != null) {
                la("");
                this.f42040f0.H(st0Var.f32564w, false);
            }
            org.telegram.ui.ok okVar = this.f42104k1;
            if (okVar != null) {
                okVar.e(st0Var.f32565x, false);
            }
            hu0Var.f29145r1.getMediaDataController().portSavedSearchResults(getClassGuid(), st0Var.f32565x, st0Var.f32564w, st0Var.f32561n, st0Var.h, this.Nc, st0Var.v, st0Var.f32563s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
