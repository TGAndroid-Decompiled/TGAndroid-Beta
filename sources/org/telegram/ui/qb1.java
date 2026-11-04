package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class qb1 implements RendererCommon.RendererEvents {
    public final zb1 f48846a;

    public qb1(zb1 zb1Var) {
        this.f48846a = zb1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zb1 zb1Var = this.f48846a;
        b8.cg cgVar = zb1Var.m1;
        if (cgVar != null) {
            cgVar.run();
            zb1Var.m1 = null;
        }
        org.telegram.messenger.g0.h3(new pu0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
