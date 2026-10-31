package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class o0 implements RendererCommon.RendererEvents {
    public final s0 f31562a;

    public o0(s0 s0Var) {
        this.f31562a = s0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        s0 s0Var = this.f31562a;
        com.google.android.gms.internal.cast.o oVar = s0Var.Y;
        if (oVar != null) {
            oVar.run();
            s0Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
