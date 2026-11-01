package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class r1 implements RendererCommon.RendererEvents {
    public final u1 f31701a;

    public r1(u1 u1Var) {
        this.f31701a = u1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        u1 u1Var = this.f31701a;
        com.google.android.gms.internal.cast.o oVar = u1Var.S;
        if (oVar != null) {
            oVar.run();
            u1Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
