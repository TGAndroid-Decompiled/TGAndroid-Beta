package org.telegram.ui.Components.voip;

import b8.cg;
import org.webrtc.RendererCommon;
public final class r1 implements RendererCommon.RendererEvents {
    public final u1 f39584a;

    public r1(u1 u1Var) {
        this.f39584a = u1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        u1 u1Var = this.f39584a;
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
