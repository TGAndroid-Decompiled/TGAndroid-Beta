package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class p implements RendererCommon.RendererEvents {
    public final t f28327a;

    public p(t tVar) {
        this.f28327a = tVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            t tVar = this.f28327a;
            if (i10 < tVar.m0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.m0.get(i10));
                ((Runnable) tVar.m0.get(i10)).run();
                i10++;
            } else {
                tVar.m0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
