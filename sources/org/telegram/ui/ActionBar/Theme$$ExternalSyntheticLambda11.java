package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig$$ExternalSyntheticLambda1;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class Theme$$ExternalSyntheticLambda11 implements RequestDelegate {
    public final int $r8$classId;
    public final int f$0;

    public Theme$$ExternalSyntheticLambda11(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(this.f$0, tLObject, 0));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(this.f$0, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(this.f$0, tLObject, tL_error);
                break;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(this.f$0).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new SharedConfig$$ExternalSyntheticLambda1(this.f$0, 10));
                break;
        }
    }
}
