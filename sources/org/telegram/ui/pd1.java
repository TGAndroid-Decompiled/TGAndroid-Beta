package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class pd1 implements RendererCommon.RendererEvents {
    public final zd1 f40464a;

    public pd1(zd1 zd1Var) {
        this.f40464a = zd1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.i0.g3(new vv0(this, 26));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
