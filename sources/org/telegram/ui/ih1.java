package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ih1 implements RendererCommon.RendererEvents {
    public final oh1 f39275a;

    public ih1(oh1 oh1Var) {
        this.f39275a = oh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.f39275a;
        c2.p pVar = oh1Var.f41156h1;
        if (pVar != null) {
            pVar.run();
            oh1Var.f41156h1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
