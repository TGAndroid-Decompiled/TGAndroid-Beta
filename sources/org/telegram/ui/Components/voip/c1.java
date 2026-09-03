package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class c1 implements RendererCommon.RendererEvents {
    public final g1 f29552a;

    public c1(g1 g1Var) {
        this.f29552a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f29552a;
        c2.p pVar = g1Var.V;
        if (pVar != null) {
            pVar.run();
            g1Var.V = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
