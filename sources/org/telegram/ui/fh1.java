package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class fh1 implements RendererCommon.RendererEvents {
    public final ph1 f39379a;

    public fh1(ph1 ph1Var) {
        this.f39379a = ph1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ph1 ph1Var = this.f39379a;
        a8.fg fgVar = ph1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            ph1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new my0(this, 26));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
