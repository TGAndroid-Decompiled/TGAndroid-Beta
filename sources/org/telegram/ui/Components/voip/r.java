package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class r implements RendererCommon.RendererEvents {
    public final v f32292a;

    public r(v vVar) {
        this.f32292a = vVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        int i10 = 0;
        while (true) {
            v vVar = this.f32292a;
            if (i10 < vVar.m0.size()) {
                AndroidUtilities.cancelRunOnUIThread((Runnable) vVar.m0.get(i10));
                ((Runnable) vVar.m0.get(i10)).run();
                i10++;
            } else {
                vVar.m0.clear();
                return;
            }
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
