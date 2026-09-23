package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class j40 implements org.telegram.ui.ActionBar.z2 {
    public final f60 f34322a;

    public j40(f60 f60Var) {
        this.f34322a = f60Var;
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
        f60 f60Var = this.f34322a;
        if (f60Var.F1 == 6) {
            f60.B0(f60Var);
        }
    }
}
