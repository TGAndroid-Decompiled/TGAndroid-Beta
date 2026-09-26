package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class g1 implements RendererCommon.RendererEvents {
    public final k1 f29359a;

    public g1(k1 k1Var) {
        this.f29359a = k1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        k1 k1Var = this.f29359a;
        com.google.android.gms.internal.cast.p pVar = k1Var.Y;
        if (pVar != null) {
            pVar.run();
            k1Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
