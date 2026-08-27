package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

public final class f1 implements RendererCommon.RendererEvents {

    public final g1 f33555a;

    public f1(g1 g1Var) {
        this.f33555a = g1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        g1 g1Var = this.f33555a;
        g1Var.f33576x = true;
        bf.e eVar = g1Var.U;
        if (eVar != null) {
            eVar.run();
            g1Var.U = null;
        }
        AndroidUtilities.runOnUIThread(new nh.f0(this, 14));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        g1 g1Var = this.f33555a;
        if (i13 == 0) {
            g1Var.Q = Float.valueOf(i11 / i10);
        } else {
            g1Var.Q = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new h3.z(this, i10, i11, 10));
    }
}
