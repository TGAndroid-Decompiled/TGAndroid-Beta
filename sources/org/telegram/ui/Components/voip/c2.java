package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.l10;
import org.webrtc.RendererCommon;
public final class c2 implements RendererCommon.RendererEvents {
    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new l10(13));
    }

    @Override
    public final void onFirstFrameRendered() {
    }
}
