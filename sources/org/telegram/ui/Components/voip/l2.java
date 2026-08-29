package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class l2 implements RendererCommon.RendererEvents {
    public final o2 f33835a;

    public l2(o2 o2Var) {
        this.f33835a = o2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        o2 o2Var = this.f33835a;
        c2.p pVar = o2Var.N;
        if (pVar != null) {
            pVar.run();
            o2Var.N = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
