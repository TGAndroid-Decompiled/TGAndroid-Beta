package org.telegram.ui.Components;

import android.os.Bundle;
public final class os0 extends org.telegram.ui.wn {
    public boolean Pc;
    public final int Qc;
    public final kv0 Rc;

    public os0(kv0 kv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = kv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        kv0 kv0Var = this.Rc;
        vu0 vu0Var = kv0Var.S;
        if (this.Pc) {
            if (this.f39519j0 != null) {
                la("");
                this.f39519j0.H(vu0Var.f29768w, false);
            }
            org.telegram.ui.vk vkVar = this.f39580o1;
            if (vkVar != null) {
                vkVar.e(vu0Var.f29769x, false);
            }
            kv0Var.f25866v1.getMediaDataController().portSavedSearchResults(getClassGuid(), vu0Var.f29769x, vu0Var.f29768w, vu0Var.f29765n, vu0Var.h, this.Qc, vu0Var.v, vu0Var.f29767s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
