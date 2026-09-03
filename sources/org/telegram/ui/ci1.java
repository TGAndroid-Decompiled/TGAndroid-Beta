package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ci1 implements RendererCommon.RendererEvents {
    public final ii1 f33163a;

    public ci1(ii1 ii1Var) {
        this.f33163a = ii1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ii1 ii1Var = this.f33163a;
        c2.p pVar = ii1Var.f34965i1;
        if (pVar != null) {
            pVar.run();
            ii1Var.f34965i1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
