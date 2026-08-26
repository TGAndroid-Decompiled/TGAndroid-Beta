package org.telegram.ui.Business;

import org.telegram.messenger.AndroidUtilities;

public final class BusinessIntroActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final BusinessIntroActivity f$0;

    public BusinessIntroActivity$$ExternalSyntheticLambda3(BusinessIntroActivity businessIntroActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = businessIntroActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateRandomSticker();
                break;
            case 1:
                this.f$0.openCustomStickerEditor();
                break;
            default:
                BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3 = this.f$0.updateRandomStickerRunnable;
                AndroidUtilities.cancelRunOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3);
                AndroidUtilities.runOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3, 5000L);
                break;
        }
    }
}
