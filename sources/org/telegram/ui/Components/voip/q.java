package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class q implements RendererCommon.RendererEvents {
    public final u f32283a;

    public q(u uVar) {
        this.f32283a = uVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            u uVar = this.f32283a;
            if (i10 < uVar.f32379j0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) uVar.f32379j0.get(i10));
                ((Runnable) uVar.f32379j0.get(i10)).run();
                i10++;
            } else {
                uVar.f32379j0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
