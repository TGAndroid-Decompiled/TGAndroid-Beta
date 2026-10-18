package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class dh1 implements RendererCommon.RendererEvents {
    public final jh1 f36223a;

    public dh1(jh1 jh1Var) {
        this.f36223a = jh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        jh1 jh1Var = this.f36223a;
        com.google.android.gms.internal.cast.p pVar = jh1Var.l1;
        if (pVar != null) {
            pVar.run();
            jh1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
