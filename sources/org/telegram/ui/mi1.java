package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class mi1 implements RendererCommon.RendererEvents {
    public final si1 f35679a;

    public mi1(si1 si1Var) {
        this.f35679a = si1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        si1 si1Var = this.f35679a;
        com.google.android.gms.internal.cast.p pVar = si1Var.l1;
        if (pVar != null) {
            pVar.run();
            si1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
