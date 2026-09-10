package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class n40 implements org.telegram.ui.ActionBar.b3 {
    public final j60 f35114a;

    public n40(j60 j60Var) {
        this.f35114a = j60Var;
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
        j60 j60Var = this.f35114a;
        if (j60Var.F1 == 6) {
            j60.B0(j60Var);
        }
    }
}
