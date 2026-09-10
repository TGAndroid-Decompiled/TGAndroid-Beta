package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class h1 implements RendererCommon.RendererEvents {
    public final i1 f28159a;

    public h1(i1 i1Var) {
        this.f28159a = i1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        i1 i1Var = this.f28159a;
        i1Var.f28179x = true;
        com.google.android.gms.internal.cast.p pVar = i1Var.Y;
        if (pVar != null) {
            pVar.run();
            i1Var.Y = null;
        }
        AndroidUtilities.runOnUIThread(new x(this, 3));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        i1 i1Var = this.f28159a;
        if (i13 == 0) {
            i1Var.U = Float.valueOf(i11 / i10);
        } else {
            i1Var.U = Float.valueOf(i10 / i11);
        }
        AndroidUtilities.runOnUIThread(new fg.n(this, i10, i11, 11));
    }
}
