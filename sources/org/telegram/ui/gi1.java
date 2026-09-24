package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class gi1 implements RendererCommon.RendererEvents {
    public final mi1 f33936a;

    public gi1(mi1 mi1Var) {
        this.f33936a = mi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        mi1 mi1Var = this.f33936a;
        com.google.android.gms.internal.cast.p pVar = mi1Var.l1;
        if (pVar != null) {
            pVar.run();
            mi1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
