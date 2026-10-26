package org.telegram.ui.Components.voip;

import a8.fg;
import org.webrtc.RendererCommon;
public final class k2 implements RendererCommon.RendererEvents {
    public final n2 f33886a;

    public k2(n2 n2Var) {
        this.f33886a = n2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        n2 n2Var = this.f33886a;
        fg fgVar = n2Var.S;
        if (fgVar != null) {
            fgVar.run();
            n2Var.S = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
