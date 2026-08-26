package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityEditActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.community.CommunitySheet;

public final class ChatActivity$$ExternalSyntheticLambda484 implements Runnable {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final long f$1;
    public final boolean f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda484(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z, boolean z2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didReceivedNotification7$193(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$setLastCreatedDialogId$55(this.f$2, this.f$3, this.f$1);
                break;
            case 2:
                CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.f$0;
                communityEditActivity.getClass();
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f$2) {
                    i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else {
                    i = this.f$3 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                AlertsCreator.showSimpleConfirmAlert(communityEditActivity, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), true, new CommunityEditActivity$$ExternalSyntheticLambda7(communityEditActivity, this.f$1, 1));
                break;
            default:
                ((CommunitySheet) this.f$0).lambda$onLongClickCommunity$6(this.f$1, this.f$2, this.f$3);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda484(ChatActivity chatActivity, long j, boolean z, boolean z2) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = j;
        this.f$2 = z;
        this.f$3 = z2;
    }
}
