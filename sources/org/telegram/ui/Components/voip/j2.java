package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

public final class j2 implements RendererCommon.RendererEvents {

    public final l2 f33637a;

    public j2(l2 l2Var) {
        this.f33637a = l2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        l2 l2Var = this.f33637a;
        bf.e eVar = l2Var.N;
        if (eVar != null) {
            eVar.run();
            l2Var.N = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
