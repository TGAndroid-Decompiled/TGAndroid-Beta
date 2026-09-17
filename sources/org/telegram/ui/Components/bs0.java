package org.telegram.ui.Components;

import android.os.Bundle;
public final class bs0 extends org.telegram.ui.co {
    public boolean Qc;
    public final int Rc;
    public final xu0 Sc;

    public bs0(xu0 xu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = xu0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xu0 xu0Var = this.Sc;
        iu0 iu0Var = xu0Var.S;
        if (this.Qc) {
            if (this.f35326j0 != null) {
                la("");
                this.f35326j0.H(iu0Var.f27292w, false);
            }
            org.telegram.ui.yk ykVar = this.f35387o1;
            if (ykVar != null) {
                ykVar.e(iu0Var.f27293x, false);
            }
            xu0Var.f32754v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iu0Var.f27293x, iu0Var.f27292w, iu0Var.f27289n, iu0Var.h, this.Rc, iu0Var.v, iu0Var.f27291s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
