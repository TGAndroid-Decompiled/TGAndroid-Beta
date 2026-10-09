package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class k40 implements org.telegram.ui.ActionBar.z2 {
    public final g60 f39074a;

    public k40(g60 g60Var) {
        this.f39074a = g60Var;
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
        g60 g60Var = this.f39074a;
        if (g60Var.F1 == 6) {
            g60.C0(g60Var);
        }
    }
}
