package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ac1 implements RendererCommon.RendererEvents {
    public final jc1 f43645a;

    public ac1(jc1 jc1Var) {
        this.f43645a = jc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new uu0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
