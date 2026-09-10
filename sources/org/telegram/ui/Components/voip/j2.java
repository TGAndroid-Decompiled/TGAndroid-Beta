package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class j2 implements RendererCommon.RendererEvents {
    public final l2 f28194a;

    public j2(l2 l2Var) {
        this.f28194a = l2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        l2 l2Var = this.f28194a;
        com.google.android.gms.internal.cast.p pVar = l2Var.R;
        if (pVar != null) {
            pVar.run();
            l2Var.R = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
