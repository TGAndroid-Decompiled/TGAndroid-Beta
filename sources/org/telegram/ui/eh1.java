package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class eh1 implements RendererCommon.RendererEvents {
    public final oh1 f36973a;

    public eh1(oh1 oh1Var) {
        this.f36973a = oh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        oh1 oh1Var = this.f36973a;
        com.google.android.gms.internal.cast.p pVar = oh1Var.l1;
        if (pVar != null) {
            pVar.run();
            oh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new my0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
