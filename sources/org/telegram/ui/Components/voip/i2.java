package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class i2 implements RendererCommon.RendererEvents {
    public final k2 f31548a;

    public i2(k2 k2Var) {
        this.f31548a = k2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        k2 k2Var = this.f31548a;
        com.google.android.gms.internal.cast.p pVar = k2Var.R;
        if (pVar != null) {
            pVar.run();
            k2Var.R = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
