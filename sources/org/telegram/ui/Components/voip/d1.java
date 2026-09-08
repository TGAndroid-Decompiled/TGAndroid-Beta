package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class d1 implements RendererCommon.RendererEvents {
    public final h1 f31476a;

    public d1(h1 h1Var) {
        this.f31476a = h1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        h1 h1Var = this.f31476a;
        com.google.android.gms.internal.cast.p pVar = h1Var.Y;
        if (pVar != null) {
            pVar.run();
            h1Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
