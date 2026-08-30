package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class h40 implements org.telegram.ui.ActionBar.a3 {
    public final c60 f34753a;

    public h40(c60 c60Var) {
        this.f34753a = c60Var;
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
        c60 c60Var = this.f34753a;
        if (c60Var.C1 == 6) {
            c60.B0(c60Var);
        }
    }
}
