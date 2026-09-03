package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class j40 implements org.telegram.ui.ActionBar.a3 {
    public final e60 f35082a;

    public j40(e60 e60Var) {
        this.f35082a = e60Var;
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
        e60 e60Var = this.f35082a;
        if (e60Var.C1 == 6) {
            e60.B0(e60Var);
        }
    }
}
