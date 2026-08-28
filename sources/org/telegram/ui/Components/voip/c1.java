package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class c1 implements RendererCommon.RendererEvents {
    public final g1 f33463a;

    public c1(g1 g1Var) {
        this.f33463a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f33463a;
        af.f fVar = g1Var.U;
        if (fVar != null) {
            fVar.run();
            g1Var.U = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
