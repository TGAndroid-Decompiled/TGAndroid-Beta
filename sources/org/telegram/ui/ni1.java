package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ni1 implements RendererCommon.RendererEvents {
    public final xi1 f40424a;

    public ni1(xi1 xi1Var) {
        this.f40424a = xi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        xi1 xi1Var = this.f40424a;
        com.google.android.gms.internal.cast.p pVar = xi1Var.l1;
        if (pVar != null) {
            pVar.run();
            xi1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new pz0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
