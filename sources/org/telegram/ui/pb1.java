package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class pb1 implements RendererCommon.RendererEvents {
    public final zb1 f48509a;

    public pb1(zb1 zb1Var) {
        this.f48509a = zb1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new pu0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
