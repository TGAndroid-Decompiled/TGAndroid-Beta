package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class r1 implements RendererCommon.RendererEvents {
    public final t1 f31636a;

    public r1(t1 t1Var) {
        this.f31636a = t1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        t1 t1Var = this.f31636a;
        com.google.android.gms.internal.cast.o oVar = t1Var.S;
        if (oVar != null) {
            oVar.run();
            t1Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
