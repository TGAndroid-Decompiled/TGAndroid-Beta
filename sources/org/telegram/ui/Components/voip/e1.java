package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class e1 implements RendererCommon.RendererEvents {
    public final i1 f28114a;

    public e1(i1 i1Var) {
        this.f28114a = i1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        i1 i1Var = this.f28114a;
        com.google.android.gms.internal.cast.p pVar = i1Var.Y;
        if (pVar != null) {
            pVar.run();
            i1Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
