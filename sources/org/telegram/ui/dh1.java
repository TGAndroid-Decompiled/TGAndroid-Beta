package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class dh1 implements RendererCommon.RendererEvents {
    public final oh1 f37544a;

    public dh1(oh1 oh1Var) {
        this.f37544a = oh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new ky0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
