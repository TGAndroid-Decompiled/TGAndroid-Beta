package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class jh1 implements RendererCommon.RendererEvents {
    public final ph1 f40671a;

    public jh1(ph1 ph1Var) {
        this.f40671a = ph1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ph1 ph1Var = this.f40671a;
        a8.fg fgVar = ph1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            ph1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
