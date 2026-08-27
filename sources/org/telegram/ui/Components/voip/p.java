package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

public final class p implements RendererCommon.RendererEvents {

    public final t f33789a;

    public p(t tVar) {
        this.f33789a = tVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            t tVar = this.f33789a;
            if (i10 >= tVar.f33884i0.size()) {
                tVar.f33884i0.clear();
                return;
            } else {
                AndroidUtilities.cancelRunOnUIThread((Runnable) tVar.f33884i0.get(i10));
                ((Runnable) tVar.f33884i0.get(i10)).run();
                i10++;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
