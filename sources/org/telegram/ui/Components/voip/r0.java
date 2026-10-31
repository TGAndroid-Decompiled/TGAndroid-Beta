package org.telegram.ui.Components.voip;

import org.telegram.ui.ActionBar.w5;
import org.webrtc.RendererCommon;
public final class r0 implements RendererCommon.RendererEvents {
    public final s0 f31635a;

    public r0(s0 s0Var) {
        this.f31635a = s0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        s0 s0Var = this.f31635a;
        s0Var.f31656y = true;
        com.google.android.gms.internal.cast.o oVar = s0Var.Y;
        if (oVar != null) {
            oVar.run();
            s0Var.Y = null;
        }
        org.telegram.messenger.i0.g3(new w5(this, 6));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        s0 s0Var = this.f31635a;
        if (i13 == 0) {
            s0Var.U = Float.valueOf(i11 / i10);
        } else {
            s0Var.U = Float.valueOf(i10 / i11);
        }
        org.telegram.messenger.i0.g3(new i2.u(this, i10, i11, 13));
    }
}
