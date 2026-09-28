package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ci1 implements RendererCommon.RendererEvents {
    public final mi1 f32733a;

    public ci1(mi1 mi1Var) {
        this.f32733a = mi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        mi1 mi1Var = this.f32733a;
        com.google.android.gms.internal.cast.p pVar = mi1Var.l1;
        if (pVar != null) {
            pVar.run();
            mi1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new vz0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
