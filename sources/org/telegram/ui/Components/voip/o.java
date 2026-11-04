package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class o implements RendererCommon.RendererEvents {
    public final r f39497a;

    public o(r rVar) {
        this.f39497a = rVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i3 = 0;
        while (true) {
            r rVar = this.f39497a;
            if (i3 < rVar.f39564n0.size()) {
                org.telegram.messenger.g0.r((Runnable) rVar.f39564n0.get(i3));
                ((Runnable) rVar.f39564n0.get(i3)).run();
                i3++;
            } else {
                rVar.f39564n0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
