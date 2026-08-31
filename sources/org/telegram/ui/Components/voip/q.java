package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class q implements RendererCommon.RendererEvents {
    public final u f32278a;

    public q(u uVar) {
        this.f32278a = uVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            u uVar = this.f32278a;
            if (i10 < uVar.f32374j0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.f32374j0.get(i10));
                ((Runnable) uVar.f32374j0.get(i10)).run();
                i10++;
            } else {
                uVar.f32374j0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
