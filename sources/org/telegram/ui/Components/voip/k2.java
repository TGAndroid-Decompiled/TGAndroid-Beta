package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final m2 f29440a;

    public k2(m2 m2Var) {
        this.f29440a = m2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        m2 m2Var = this.f29440a;
        com.google.android.gms.internal.cast.p pVar = m2Var.R;
        if (pVar != null) {
            pVar.run();
            m2Var.R = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
