package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class d0 implements RendererCommon.RendererEvents {
    public final e0 f40537a;

    public d0(e0 e0Var) {
        this.f40537a = e0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new c0(this.f40537a, 0));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new c0(this.f40537a, 1));
    }
}
