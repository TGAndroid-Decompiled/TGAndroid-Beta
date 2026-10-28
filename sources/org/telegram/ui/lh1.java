package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class lh1 implements RendererCommon.RendererEvents {
    public final rh1 f41190a;

    public lh1(rh1 rh1Var) {
        this.f41190a = rh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        rh1 rh1Var = this.f41190a;
        a8.fg fgVar = rh1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            rh1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
