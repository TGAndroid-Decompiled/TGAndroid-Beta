package org.telegram.ui.Components.voip;

import b8.cg;
import org.webrtc.RendererCommon;
public final class s1 implements RendererCommon.RendererEvents {
    public final u1 f39603a;

    public s1(u1 u1Var) {
        this.f39603a = u1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        u1 u1Var = this.f39603a;
        cg cgVar = u1Var.T;
        if (cgVar != null) {
            cgVar.run();
            u1Var.T = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
