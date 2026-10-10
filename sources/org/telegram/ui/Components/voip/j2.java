package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class j2 implements RendererCommon.RendererEvents {
    public final m2 f32075a;

    public j2(m2 m2Var) {
        this.f32075a = m2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        m2 m2Var = this.f32075a;
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
