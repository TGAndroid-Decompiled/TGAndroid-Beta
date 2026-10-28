package org.telegram.ui.Components;

import android.os.Bundle;
public final class jt0 extends org.telegram.ui.wn {
    public boolean f29765od;
    public final int f29766pd;
    public final bw0 f29767qd;

    public jt0(bw0 bw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f29767qd = bw0Var;
        this.f29766pd = i10;
        this.f29765od = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        bw0 bw0Var = this.f29767qd;
        nv0 nv0Var = bw0Var.U;
        if (this.f29765od) {
            if (this.f45162j0 != null) {
                ya("");
                this.f45162j0.P(nv0Var.f31081w, false);
            }
            org.telegram.ui.uk ukVar = this.A1;
            if (ukVar != null) {
                ukVar.e(nv0Var.f31082x, false);
            }
            bw0Var.f26992x1.getMediaDataController().portSavedSearchResults(getClassGuid(), nv0Var.f31082x, nv0Var.f31081w, nv0Var.f31078n, nv0Var.h, this.f29766pd, nv0Var.v, nv0Var.f31080s);
            this.f29765od = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
