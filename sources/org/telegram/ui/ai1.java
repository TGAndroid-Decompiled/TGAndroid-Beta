package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ai1 implements RendererCommon.RendererEvents {
    public final ki1 f34886a;

    public ai1(ki1 ki1Var) {
        this.f34886a = ki1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ki1 ki1Var = this.f34886a;
        com.google.android.gms.internal.cast.p pVar = ki1Var.l1;
        if (pVar != null) {
            pVar.run();
            ki1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new hz0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
