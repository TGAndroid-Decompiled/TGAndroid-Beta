package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class h2 implements RendererCommon.RendererEvents {
    public final k2 f31503a;

    public h2(k2 k2Var) {
        this.f31503a = k2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        k2 k2Var = this.f31503a;
        com.google.android.gms.internal.cast.p pVar = k2Var.S;
        if (pVar != null) {
            pVar.run();
            k2Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
