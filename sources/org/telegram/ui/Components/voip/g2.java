package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.ne;
import org.webrtc.RendererCommon;
public final class g2 implements RendererCommon.RendererEvents {
    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new ne(21));
    }

    @Override
    public final void onFirstFrameRendered() {
    }
}
