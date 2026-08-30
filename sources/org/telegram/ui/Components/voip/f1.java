package org.telegram.ui.Components.voip;

import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class f1 implements RendererCommon.RendererEvents {
    public final g1 f29627a;

    public f1(g1 g1Var) {
        this.f29627a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f29627a;
        g1Var.f29645x = true;
        c2.p pVar = g1Var.V;
        if (pVar != null) {
            pVar.run();
            g1Var.V = null;
        }
        AndroidUtilities.runOnUIThread(new n5(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        g1 g1Var = this.f29627a;
        if (i13 == 0) {
            g1Var.R = Float.valueOf(i11 / i10);
        } else {
            g1Var.R = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new j3.v(this, i10, i11, 10));
    }
}
