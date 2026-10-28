package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class a40 implements org.telegram.ui.ActionBar.d3 {
    public final x50 f37684a;

    public a40(x50 x50Var) {
        this.f37684a = x50Var;
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
        x50 x50Var = this.f37684a;
        if (x50Var.F1 == 6) {
            x50.B0(x50Var);
        }
    }
}
