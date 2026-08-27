package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

public final class c1 implements RendererCommon.RendererEvents {

    public final g1 f33513a;

    public c1(g1 g1Var) {
        this.f33513a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f33513a;
        bf.e eVar = g1Var.U;
        if (eVar != null) {
            eVar.run();
            g1Var.U = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
