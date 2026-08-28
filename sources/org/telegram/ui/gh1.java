package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class gh1 implements RendererCommon.RendererEvents {
    public final mh1 f38553a;

    public gh1(mh1 mh1Var) {
        this.f38553a = mh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        mh1 mh1Var = this.f38553a;
        af.f fVar = mh1Var.f40448h1;
        if (fVar != null) {
            fVar.run();
            mh1Var.f40448h1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
