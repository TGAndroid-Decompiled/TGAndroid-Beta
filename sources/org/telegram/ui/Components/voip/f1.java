package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class f1 implements RendererCommon.RendererEvents {
    public final g1 f33505a;

    public f1(g1 g1Var) {
        this.f33505a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f33505a;
        g1Var.f33526x = true;
        af.f fVar = g1Var.U;
        if (fVar != null) {
            fVar.run();
            g1Var.U = null;
        }
        AndroidUtilities.runOnUIThread(new mh.m2(this, 8));
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
        int i12 = (i11 / 90) % 2;
        g1 g1Var = this.f33505a;
        if (i12 == 0) {
            g1Var.Q = Float.valueOf(i10 / i9);
        } else {
            g1Var.Q = Float.valueOf(i9 / i10);
        }
        AndroidUtilities.runOnUIThread(new h3.y(this, i9, i10, 11));
    }
}
