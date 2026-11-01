package org.telegram.ui.Components.voip;

import org.telegram.ui.ActionBar.w5;
import org.webrtc.RendererCommon;
public final class s0 implements RendererCommon.RendererEvents {
    public final t0 f31714a;

    public s0(t0 t0Var) {
        this.f31714a = t0Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        t0 t0Var = this.f31714a;
        t0Var.f31735y = true;
        com.google.android.gms.internal.cast.o oVar = t0Var.Y;
        if (oVar != null) {
            oVar.run();
            t0Var.Y = null;
        }
        org.telegram.messenger.i0.g3(new w5(this, 6));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13 = (i12 / 90) % 2;
        t0 t0Var = this.f31714a;
        if (i13 == 0) {
            t0Var.U = Float.valueOf(i11 / i10);
        } else {
            t0Var.U = Float.valueOf(i10 / i11);
        }
        org.telegram.messenger.i0.g3(new i2.u(this, i10, i11, 13));
    }
}
