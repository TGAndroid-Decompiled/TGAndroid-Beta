package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class q implements RendererCommon.RendererEvents {
    public final u f29166a;

    public q(u uVar) {
        this.f29166a = uVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            u uVar = this.f29166a;
            if (i10 < uVar.m0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.m0.get(i10));
                ((Runnable) uVar.m0.get(i10)).run();
                i10++;
            } else {
                uVar.m0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
