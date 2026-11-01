package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class qd1 implements RendererCommon.RendererEvents {
    public final zd1 f40757a;

    public qd1(zd1 zd1Var) {
        this.f40757a = zd1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zd1 zd1Var = this.f40757a;
        com.google.android.gms.internal.cast.o oVar = zd1Var.l1;
        if (oVar != null) {
            oVar.run();
            zd1Var.l1 = null;
        }
        org.telegram.messenger.i0.g3(new vv0(this, 27));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
