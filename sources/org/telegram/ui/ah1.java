package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

public final class ah1 implements RendererCommon.RendererEvents {

    public final lh1 f36537a;

    public ah1(lh1 lh1Var) {
        this.f36537a = lh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new ky0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
