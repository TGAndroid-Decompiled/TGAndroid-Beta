package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ji1 implements RendererCommon.RendererEvents {
    public final ti1 f34899a;

    public ji1(ti1 ti1Var) {
        this.f34899a = ti1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ti1 ti1Var = this.f34899a;
        com.google.android.gms.internal.cast.p pVar = ti1Var.l1;
        if (pVar != null) {
            pVar.run();
            ti1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new g01(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
