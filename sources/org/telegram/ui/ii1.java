package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ii1 implements RendererCommon.RendererEvents {
    public final si1 f34538a;

    public ii1(si1 si1Var) {
        this.f34538a = si1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        si1 si1Var = this.f34538a;
        com.google.android.gms.internal.cast.p pVar = si1Var.l1;
        if (pVar != null) {
            pVar.run();
            si1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new e01(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
