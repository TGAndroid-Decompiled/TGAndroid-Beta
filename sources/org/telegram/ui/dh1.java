package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class dh1 implements RendererCommon.RendererEvents {
    public final nh1 f36631a;

    public dh1(nh1 nh1Var) {
        this.f36631a = nh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        nh1 nh1Var = this.f36631a;
        com.google.android.gms.internal.cast.p pVar = nh1Var.l1;
        if (pVar != null) {
            pVar.run();
            nh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new ly0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
