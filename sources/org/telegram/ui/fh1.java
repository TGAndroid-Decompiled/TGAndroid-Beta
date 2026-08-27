package org.telegram.ui;

import org.webrtc.RendererCommon;

public final class fh1 implements RendererCommon.RendererEvents {

    public final lh1 f38138a;

    public fh1(lh1 lh1Var) {
        this.f38138a = lh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        lh1 lh1Var = this.f38138a;
        bf.e eVar = lh1Var.f40109h1;
        if (eVar != null) {
            eVar.run();
            lh1Var.f40109h1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
