package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ki1 implements RendererCommon.RendererEvents {
    public final ui1 f38075a;

    public ki1(ui1 ui1Var) {
        this.f38075a = ui1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ui1 ui1Var = this.f38075a;
        com.google.android.gms.internal.cast.p pVar = ui1Var.l1;
        if (pVar != null) {
            pVar.run();
            ui1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new f01(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
