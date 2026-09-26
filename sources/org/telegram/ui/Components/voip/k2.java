package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final n2 f29432a;

    public k2(n2 n2Var) {
        this.f29432a = n2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        n2 n2Var = this.f29432a;
        com.google.android.gms.internal.cast.p pVar = n2Var.R;
        if (pVar != null) {
            pVar.run();
            n2Var.R = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
