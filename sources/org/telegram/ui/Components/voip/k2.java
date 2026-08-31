package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final n2 f32121a;

    public k2(n2 n2Var) {
        this.f32121a = n2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        n2 n2Var = this.f32121a;
        c2.p pVar = n2Var.O;
        if (pVar != null) {
            pVar.run();
            n2Var.O = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
