package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class p0 implements RendererCommon.RendererEvents {
    public final t0 f31641a;

    public p0(t0 t0Var) {
        this.f31641a = t0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        t0 t0Var = this.f31641a;
        com.google.android.gms.internal.cast.o oVar = t0Var.Y;
        if (oVar != null) {
            oVar.run();
            t0Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
