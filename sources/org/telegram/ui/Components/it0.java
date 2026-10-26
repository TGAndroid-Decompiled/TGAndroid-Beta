package org.telegram.ui.Components;

import android.os.Bundle;
public final class it0 extends org.telegram.ui.un {
    public boolean f29375kd;
    public final int f29376ld;
    public final aw0 f29377md;

    public it0(aw0 aw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f29377md = aw0Var;
        this.f29376ld = i10;
        this.f29375kd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        aw0 aw0Var = this.f29377md;
        mv0 mv0Var = aw0Var.U;
        if (this.f29375kd) {
            if (this.f44294j0 != null) {
                va("");
                this.f44294j0.P(mv0Var.f30759w, false);
            }
            org.telegram.ui.sk skVar = this.A1;
            if (skVar != null) {
                skVar.e(mv0Var.f30760x, false);
            }
            aw0Var.f26704x1.getMediaDataController().portSavedSearchResults(getClassGuid(), mv0Var.f30760x, mv0Var.f30759w, mv0Var.f30756n, mv0Var.h, this.f29376ld, mv0Var.v, mv0Var.f30758s);
            this.f29375kd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
