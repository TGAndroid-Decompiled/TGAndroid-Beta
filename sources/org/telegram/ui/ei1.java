package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ei1 implements RendererCommon.RendererEvents {
    public final ki1 f33274a;

    public ei1(ki1 ki1Var) {
        this.f33274a = ki1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ki1 ki1Var = this.f33274a;
        com.google.android.gms.internal.cast.p pVar = ki1Var.l1;
        if (pVar != null) {
            pVar.run();
            ki1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
