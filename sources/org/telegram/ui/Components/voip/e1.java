package org.telegram.ui.Components.voip;

import a8.fg;
import org.webrtc.RendererCommon;
public final class e1 implements RendererCommon.RendererEvents {
    public final i1 f33891a;

    public e1(i1 i1Var) {
        this.f33891a = i1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        i1 i1Var = this.f33891a;
        fg fgVar = i1Var.Y;
        if (fgVar != null) {
            fgVar.run();
            i1Var.Y = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
