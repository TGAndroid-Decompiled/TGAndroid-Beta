package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class hh1 implements RendererCommon.RendererEvents {
    public final rh1 f39898a;

    public hh1(rh1 rh1Var) {
        this.f39898a = rh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        rh1 rh1Var = this.f39898a;
        a8.fg fgVar = rh1Var.l1;
        if (fgVar != null) {
            fgVar.run();
            rh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new oy0(this, 26));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
