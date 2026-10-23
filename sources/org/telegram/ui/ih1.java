package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ih1 implements RendererCommon.RendererEvents {
    public final oh1 f38234a;

    public ih1(oh1 oh1Var) {
        this.f38234a = oh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.f38234a;
        com.google.android.gms.internal.cast.p pVar = oh1Var.l1;
        if (pVar != null) {
            pVar.run();
            oh1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
