package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class i1 implements RendererCommon.RendererEvents {
    public final j1 f29394a;

    public i1(j1 j1Var) {
        this.f29394a = j1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        j1 j1Var = this.f29394a;
        j1Var.f29418x = true;
        com.google.android.gms.internal.cast.p pVar = j1Var.Y;
        if (pVar != null) {
            pVar.run();
            j1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new i2.g0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        j1 j1Var = this.f29394a;
        if (i13 == 0) {
            j1Var.U = Float.valueOf(i11 / i10);
        } else {
            j1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new gg.n(this, i10, i11, 11));
    }
}
