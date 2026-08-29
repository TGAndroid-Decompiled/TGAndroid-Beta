package org.telegram.ui.Components.voip;

import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class g1 implements RendererCommon.RendererEvents {
    public final h1 f33705a;

    public g1(h1 h1Var) {
        this.f33705a = h1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        h1 h1Var = this.f33705a;
        h1Var.f33740x = true;
        c2.p pVar = h1Var.U;
        if (pVar != null) {
            pVar.run();
            h1Var.U = null;
        }
        AndroidUtilities.runOnUIThread(new m6(this, 17));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        h1 h1Var = this.f33705a;
        if (i13 == 0) {
            h1Var.Q = Float.valueOf(i11 / i10);
        } else {
            h1Var.Q = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new j3.y(this, i10, i11, 10));
    }
}
