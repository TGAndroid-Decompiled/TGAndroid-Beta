package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class pi1 implements RendererCommon.RendererEvents {
    public final zi1 f35849a;

    public pi1(zi1 zi1Var) {
        this.f35849a = zi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zi1 zi1Var = this.f35849a;
        com.google.android.gms.internal.cast.p pVar = zi1Var.l1;
        if (pVar != null) {
            pVar.run();
            zi1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new k01(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
