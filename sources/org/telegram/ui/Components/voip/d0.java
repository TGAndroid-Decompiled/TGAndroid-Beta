package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class d0 implements RendererCommon.RendererEvents {
    public final e0 f40816a;

    public d0(e0 e0Var) {
        this.f40816a = e0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new c0(this.f40816a, 0));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new c0(this.f40816a, 1));
    }
}
