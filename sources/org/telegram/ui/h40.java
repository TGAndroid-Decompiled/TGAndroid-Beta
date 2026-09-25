package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class h40 implements org.telegram.ui.ActionBar.y2 {
    public final d60 f34121a;

    public h40(d60 d60Var) {
        this.f34121a = d60Var;
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
        d60 d60Var = this.f34121a;
        if (d60Var.F1 == 6) {
            d60.B0(d60Var);
        }
    }
}
