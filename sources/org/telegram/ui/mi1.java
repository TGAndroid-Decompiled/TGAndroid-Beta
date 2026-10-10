package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class mi1 implements RendererCommon.RendererEvents {
    public final wi1 f39973a;

    public mi1(wi1 wi1Var) {
        this.f39973a = wi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        wi1 wi1Var = this.f39973a;
        com.google.android.gms.internal.cast.p pVar = wi1Var.l1;
        if (pVar != null) {
            pVar.run();
            wi1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new nz0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
