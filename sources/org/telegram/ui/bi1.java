package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class bi1 implements RendererCommon.RendererEvents {
    public final mi1 f32431a;

    public bi1(mi1 mi1Var) {
        this.f32431a = mi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new vz0(this, 21));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
