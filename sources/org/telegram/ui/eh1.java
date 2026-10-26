package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class eh1 implements RendererCommon.RendererEvents {
    public final ph1 f39112a;

    public eh1(ph1 ph1Var) {
        this.f39112a = ph1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new my0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
