package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class i2 implements RendererCommon.RendererEvents {
    public final l2 f33565a;

    public i2(l2 l2Var) {
        this.f33565a = l2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        l2 l2Var = this.f33565a;
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
