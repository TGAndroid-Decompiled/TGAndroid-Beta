package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class c0 implements RendererCommon.RendererEvents {
    public final d0 f40922a;

    public c0(d0 d0Var) {
        this.f40922a = d0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new b0(this.f40922a, 0));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new b0(this.f40922a, 1));
    }
}
