package org.telegram.ui.community;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.AlertDialog;

public final class CommunitySheet$$ExternalSyntheticLambda6 implements MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final AlertDialog f$1;
    public final long f$2;
    public final boolean f$3;

    public CommunitySheet$$ExternalSyntheticLambda6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, AlertDialog alertDialog, long j, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = alertDialog;
        this.f$2 = j;
        this.f$3 = z;
    }

    @Override
    public final void run(long j) {
        switch (this.$r8$classId) {
            case 0:
                ((CommunitySheet) this.f$0).lambda$linkToCommunity$9(this.f$1, this.f$2, this.f$3, j);
                break;
            default:
                CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) this.f$0;
                communityCreateActivity.getClass();
                this.f$1.dismiss();
                if (j != 0) {
                    communityCreateActivity.dialogId = -j;
                    communityCreateActivity.currentChat = communityCreateActivity.getMessagesController().getChat(Long.valueOf(j));
                    communityCreateActivity.linkToCommunity(this.f$2, this.f$3);
                    break;
                }
                break;
        }
    }
}
