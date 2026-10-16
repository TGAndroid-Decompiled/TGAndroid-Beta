package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class q40 implements org.telegram.ui.ActionBar.y2 {
    public final n60 f39059a;

    public q40(n60 n60Var) {
        this.f39059a = n60Var;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        n60 n60Var = this.f39059a;
        if (n60Var.F1 == 6) {
            n60.C0(n60Var);
        }
    }
}
