package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class gh1 implements RendererCommon.RendererEvents {
    public final rh1 f39620a;

    public gh1(rh1 rh1Var) {
        this.f39620a = rh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new oy0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
