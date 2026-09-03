package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final m2 f29722a;

    public k2(m2 m2Var) {
        this.f29722a = m2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        m2 m2Var = this.f29722a;
        c2.p pVar = m2Var.O;
        if (pVar != null) {
            pVar.run();
            m2Var.O = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
