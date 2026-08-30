package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ph1 implements RendererCommon.RendererEvents {
    public final ai1 f37343a;

    public ph1(ai1 ai1Var) {
        this.f37343a = ai1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new vy0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
