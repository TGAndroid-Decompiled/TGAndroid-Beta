package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class g1 implements RendererCommon.RendererEvents {
    public final h1 f31496a;

    public g1(h1 h1Var) {
        this.f31496a = h1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        h1 h1Var = this.f31496a;
        h1Var.f31527x = true;
        com.google.android.gms.internal.cast.p pVar = h1Var.Y;
        if (pVar != null) {
            pVar.run();
            h1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new ig.t0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        h1 h1Var = this.f31496a;
        if (i13 == 0) {
            h1Var.U = Float.valueOf(i11 / i10);
        } else {
            h1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new hg.n(this, i10, i11, 11));
    }
}
