package org.telegram.ui.ActionBar;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda42;

public final class Theme$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId;
    public final int f$0;

    public Theme$$ExternalSyntheticLambda9(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda18(i, tLObject));
                break;
            case 1:
                VoIPGroupNotification.lambda$decline$3(i, tLObject, tL_error);
                break;
            case 2:
                VoIPPreNotificationService.lambda$decline$4(i, tLObject, tL_error);
                break;
            case 3:
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                break;
            case 4:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda18(i, tLObject, 2));
                break;
            case 5:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda18(i, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda42(i, 11));
                break;
        }
    }
}
