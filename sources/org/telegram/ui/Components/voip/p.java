package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class p implements RendererCommon.RendererEvents {
    public final t f33739a;

    public p(t tVar) {
        this.f33739a = tVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i9 = 0;
        while (true) {
            t tVar = this.f33739a;
            if (i9 < tVar.f33834i0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.f33834i0.get(i9));
                ((Runnable) tVar.f33834i0.get(i9)).run();
                i9++;
            } else {
                tVar.f33834i0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
