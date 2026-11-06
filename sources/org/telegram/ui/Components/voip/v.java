package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class v implements RendererCommon.RendererEvents {
    public final y f39521a;

    public v(y yVar) {
        this.f39521a = yVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i7 = 0;
        while (true) {
            y yVar = this.f39521a;
            if (i7 < yVar.m0.size()) {
                org.telegram.messenger.g0.r((Runnable) yVar.m0.get(i7));
                ((Runnable) yVar.m0.get(i7)).run();
                i7++;
            } else {
                yVar.m0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
