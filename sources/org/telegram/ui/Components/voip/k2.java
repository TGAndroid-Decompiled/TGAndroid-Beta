package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final m2 f32031a;

    public k2(m2 m2Var) {
        this.f32031a = m2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        m2 m2Var = this.f32031a;
        com.google.android.gms.internal.cast.p pVar = m2Var.S;
        if (pVar != null) {
            pVar.run();
            m2Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
