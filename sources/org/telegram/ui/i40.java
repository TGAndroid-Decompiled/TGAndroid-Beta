package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class i40 implements org.telegram.ui.ActionBar.b3 {
    public final d60 f37737a;

    public i40(d60 d60Var) {
        this.f37737a = d60Var;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        d60 d60Var = this.f37737a;
        if (d60Var.C1 == 6) {
            d60.B0(d60Var);
        }
    }
}
