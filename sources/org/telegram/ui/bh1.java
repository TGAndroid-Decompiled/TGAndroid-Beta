package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class bh1 implements RendererCommon.RendererEvents {
    public final hh1 f35638a;

    public bh1(hh1 hh1Var) {
        this.f35638a = hh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        hh1 hh1Var = this.f35638a;
        com.google.android.gms.internal.cast.p pVar = hh1Var.l1;
        if (pVar != null) {
            pVar.run();
            hh1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
