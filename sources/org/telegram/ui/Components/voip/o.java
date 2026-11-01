package org.telegram.ui.Components.voip;

import org.webrtc.RendererCommon;
public final class o implements RendererCommon.RendererEvents {
    public final r f31630a;

    public o(r rVar) {
        this.f31630a = rVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            r rVar = this.f31630a;
            if (i10 < rVar.m0.size()) {
                org.telegram.messenger.i0.r((Runnable) rVar.m0.get(i10));
                ((Runnable) rVar.m0.get(i10)).run();
                i10++;
            } else {
                rVar.m0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
