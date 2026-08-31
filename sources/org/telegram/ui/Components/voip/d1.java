package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class d1 implements RendererCommon.RendererEvents {
    public final h1 f31992a;

    public d1(h1 h1Var) {
        this.f31992a = h1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        h1 h1Var = this.f31992a;
        c2.p pVar = h1Var.V;
        if (pVar != null) {
            pVar.run();
            h1Var.V = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
