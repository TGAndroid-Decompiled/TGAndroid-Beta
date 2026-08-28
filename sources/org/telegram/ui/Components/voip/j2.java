package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class j2 implements RendererCommon.RendererEvents {
    public final l2 f33587a;

    public j2(l2 l2Var) {
        this.f33587a = l2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        l2 l2Var = this.f33587a;
        af.f fVar = l2Var.N;
        if (fVar != null) {
            fVar.run();
            l2Var.N = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
