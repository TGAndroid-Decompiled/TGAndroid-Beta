package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class qi1 implements RendererCommon.RendererEvents {
    public final wi1 f41134a;

    public qi1(wi1 wi1Var) {
        this.f41134a = wi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        wi1 wi1Var = this.f41134a;
        com.google.android.gms.internal.cast.p pVar = wi1Var.l1;
        if (pVar != null) {
            pVar.run();
            wi1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
