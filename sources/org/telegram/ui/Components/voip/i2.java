package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;

public final class i2 implements RendererCommon.RendererEvents {

    public final l2 f33615a;

    public i2(l2 l2Var) {
        this.f33615a = l2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        l2 l2Var = this.f33615a;
        bf.e eVar = l2Var.N;
        if (eVar != null) {
            eVar.run();
            l2Var.N = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
