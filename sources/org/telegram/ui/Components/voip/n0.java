package org.telegram.ui.Components.voip;

import b8.cg;
import org.webrtc.RendererCommon;
public final class n0 implements RendererCommon.RendererEvents {
    public final s0 f39493a;

    public n0(s0 s0Var) {
        this.f39493a = s0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        s0 s0Var = this.f39493a;
        cg cgVar = s0Var.Z;
        if (cgVar != null) {
            cgVar.run();
            s0Var.Z = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
