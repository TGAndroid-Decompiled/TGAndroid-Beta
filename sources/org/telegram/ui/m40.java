package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class m40 implements org.telegram.ui.ActionBar.z2 {
    public final i60 f35617a;

    public m40(i60 i60Var) {
        this.f35617a = i60Var;
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
        i60 i60Var = this.f35617a;
        if (i60Var.F1 == 6) {
            i60.B0(i60Var);
        }
    }
}
