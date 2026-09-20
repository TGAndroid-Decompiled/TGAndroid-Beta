package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class f1 implements RendererCommon.RendererEvents {
    public final j1 f29348a;

    public f1(j1 j1Var) {
        this.f29348a = j1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        j1 j1Var = this.f29348a;
        com.google.android.gms.internal.cast.p pVar = j1Var.Y;
        if (pVar != null) {
            pVar.run();
            j1Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
