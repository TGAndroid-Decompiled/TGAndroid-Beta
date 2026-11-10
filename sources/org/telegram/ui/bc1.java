package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class bc1 implements RendererCommon.RendererEvents {
    public final jc1 f44007a;

    public bc1(jc1 jc1Var) {
        this.f44007a = jc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new uu0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(15));
    }
}
