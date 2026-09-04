package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class oi1 implements RendererCommon.RendererEvents {
    public final ui1 f39258a;

    public oi1(ui1 ui1Var) {
        this.f39258a = ui1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ui1 ui1Var = this.f39258a;
        com.google.android.gms.internal.cast.p pVar = ui1Var.l1;
        if (pVar != null) {
            pVar.run();
            ui1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
