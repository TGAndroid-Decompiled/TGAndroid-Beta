package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class o40 implements org.telegram.ui.ActionBar.a3 {
    public final k60 f36224a;

    public o40(k60 k60Var) {
        this.f36224a = k60Var;
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
        k60 k60Var = this.f36224a;
        if (k60Var.F1 == 6) {
            k60.B0(k60Var);
        }
    }
}
