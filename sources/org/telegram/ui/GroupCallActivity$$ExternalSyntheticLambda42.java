package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class GroupCallActivity$$ExternalSyntheticLambda42 implements RequestDelegate {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final int f$1;
    public final boolean f$2;

    public GroupCallActivity$$ExternalSyntheticLambda42(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = i;
        this.f$2 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda1(this.f$1, 6, groupCallActivity, tLObject, this.f$2));
                break;
            default:
                ((VoIPService) this.f$0).lambda$startGroupCall$29(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
