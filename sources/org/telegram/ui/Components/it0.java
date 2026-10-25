package org.telegram.ui.Components;

import android.os.Bundle;
public final class it0 extends org.telegram.ui.un {
    public boolean f29373kd;
    public final int f29374ld;
    public final aw0 f29375md;

    public it0(aw0 aw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.f29375md = aw0Var;
        this.f29374ld = i10;
        this.f29373kd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        aw0 aw0Var = this.f29375md;
        mv0 mv0Var = aw0Var.U;
        if (this.f29373kd) {
            if (this.f44291j0 != null) {
                va("");
                this.f44291j0.P(mv0Var.f30757w, false);
            }
            org.telegram.ui.sk skVar = this.A1;
            if (skVar != null) {
                skVar.e(mv0Var.f30758x, false);
            }
            aw0Var.f26702x1.getMediaDataController().portSavedSearchResults(getClassGuid(), mv0Var.f30758x, mv0Var.f30757w, mv0Var.f30754n, mv0Var.h, this.f29374ld, mv0Var.v, mv0Var.f30756s);
            this.f29373kd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
