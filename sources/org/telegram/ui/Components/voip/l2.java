package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class l2 implements RendererCommon.RendererEvents {
    public final n2 f32090a;

    public l2(n2 n2Var) {
        this.f32090a = n2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        n2 n2Var = this.f32090a;
        com.google.android.gms.internal.cast.p pVar = n2Var.S;
        if (pVar != null) {
            pVar.run();
            n2Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
