package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class LaunchActivity$$ExternalSyntheticLambda40 implements RequestDelegate {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda40(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(26, launchActivity, (TL_account.Password) tLObject));
                }
                break;
            default:
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(22, launchActivity2, tLObject));
                break;
        }
    }
}
