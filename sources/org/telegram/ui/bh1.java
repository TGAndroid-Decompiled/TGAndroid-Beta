package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class bh1 implements RendererCommon.RendererEvents {
    public final mh1 f36861a;

    public bh1(mh1 mh1Var) {
        this.f36861a = mh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new ky0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
