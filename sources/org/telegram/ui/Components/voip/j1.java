package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class j1 implements RendererCommon.RendererEvents {
    public final k1 f29410a;

    public j1(k1 k1Var) {
        this.f29410a = k1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        k1 k1Var = this.f29410a;
        k1Var.f29431x = true;
        com.google.android.gms.internal.cast.p pVar = k1Var.Y;
        if (pVar != null) {
            pVar.run();
            k1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new i2.h0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        k1 k1Var = this.f29410a;
        if (i13 == 0) {
            k1Var.U = Float.valueOf(i11 / i10);
        } else {
            k1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new gg.n(this, i10, i11, 11));
    }
}
