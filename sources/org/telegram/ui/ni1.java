package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ni1 implements RendererCommon.RendererEvents {
    public final ti1 f35991a;

    public ni1(ti1 ti1Var) {
        this.f35991a = ti1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ti1 ti1Var = this.f35991a;
        com.google.android.gms.internal.cast.p pVar = ti1Var.l1;
        if (pVar != null) {
            pVar.run();
            ti1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
