package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class qh1 implements RendererCommon.RendererEvents {
    public final ai1 f37760a;

    public qh1(ai1 ai1Var) {
        this.f37760a = ai1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ai1 ai1Var = this.f37760a;
        c2.p pVar = ai1Var.f32619i1;
        if (pVar != null) {
            pVar.run();
            ai1Var.f32619i1 = null;
        }
        AndroidUtilities.runOnUIThread(new vy0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
