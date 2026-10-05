package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class m40 implements org.telegram.ui.ActionBar.z2 {
    public final h60 f38469a;

    public m40(h60 h60Var) {
        this.f38469a = h60Var;
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
        h60 h60Var = this.f38469a;
        if (h60Var.F1 == 6) {
            h60.B0(h60Var);
        }
    }
}
