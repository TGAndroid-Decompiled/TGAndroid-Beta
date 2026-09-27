package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ai1 implements RendererCommon.RendererEvents {
    public final ki1 f32081a;

    public ai1(ki1 ki1Var) {
        this.f32081a = ki1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ki1 ki1Var = this.f32081a;
        com.google.android.gms.internal.cast.p pVar = ki1Var.l1;
        if (pVar != null) {
            pVar.run();
            ki1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new xz0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
