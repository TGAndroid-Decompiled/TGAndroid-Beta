package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class w implements RendererCommon.RendererEvents {
    public final z f41298a;

    public w(z zVar) {
        this.f41298a = zVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i7 = 0;
        while (true) {
            z zVar = this.f41298a;
            if (i7 < zVar.f41375n0.size()) {
                org.telegram.messenger.g0.r((Runnable) zVar.f41375n0.get(i7));
                ((Runnable) zVar.f41375n0.get(i7)).run();
                i7++;
            } else {
                zVar.f41375n0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
