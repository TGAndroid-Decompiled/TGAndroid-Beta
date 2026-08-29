package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class eh1 implements RendererCommon.RendererEvents {
    public final oh1 f37838a;

    public eh1(oh1 oh1Var) {
        this.f37838a = oh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.f37838a;
        c2.p pVar = oh1Var.f41156h1;
        if (pVar != null) {
            pVar.run();
            oh1Var.f41156h1 = null;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
