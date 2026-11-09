package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ac1 implements RendererCommon.RendererEvents {
    public final ic1 f43670a;

    public ac1(ic1 ic1Var) {
        this.f43670a = ic1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new tu0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(15));
    }
}
