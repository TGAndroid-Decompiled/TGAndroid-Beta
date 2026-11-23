package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class v implements RendererCommon.RendererEvents {
    public final y f41402a;

    public v(y yVar) {
        this.f41402a = yVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i7 = 0;
        while (true) {
            y yVar = this.f41402a;
            if (i7 < yVar.f41479n0.size()) {
                org.telegram.messenger.g0.r((Runnable) yVar.f41479n0.get(i7));
                ((Runnable) yVar.f41479n0.get(i7)).run();
                i7++;
            } else {
                yVar.f41479n0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
