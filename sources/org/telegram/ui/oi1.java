package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class oi1 implements RendererCommon.RendererEvents {
    public final zi1 f35502a;

    public oi1(zi1 zi1Var) {
        this.f35502a = zi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new k01(this, 21));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
