package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ch1 implements RendererCommon.RendererEvents {
    public final mh1 f37214a;

    public ch1(mh1 mh1Var) {
        this.f37214a = mh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        mh1 mh1Var = this.f37214a;
        af.f fVar = mh1Var.f40448h1;
        if (fVar != null) {
            fVar.run();
            mh1Var.f40448h1 = null;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
