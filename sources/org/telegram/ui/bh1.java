package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;

public final class bh1 implements RendererCommon.RendererEvents {

    public final lh1 f36833a;

    public bh1(lh1 lh1Var) {
        this.f36833a = lh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        lh1 lh1Var = this.f36833a;
        bf.e eVar = lh1Var.f40109h1;
        if (eVar != null) {
            eVar.run();
            lh1Var.f40109h1 = null;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
