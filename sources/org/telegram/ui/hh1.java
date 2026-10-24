package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class hh1 implements RendererCommon.RendererEvents {
    public final nh1 f37871a;

    public hh1(nh1 nh1Var) {
        this.f37871a = nh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        nh1 nh1Var = this.f37871a;
        com.google.android.gms.internal.cast.p pVar = nh1Var.l1;
        if (pVar != null) {
            pVar.run();
            nh1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
