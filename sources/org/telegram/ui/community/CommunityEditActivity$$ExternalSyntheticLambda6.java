package org.telegram.ui.community;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

public final class CommunityEditActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final CommunityEditActivity f$0;

    public CommunityEditActivity$$ExternalSyntheticLambda6(CommunityEditActivity communityEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = communityEditActivity;
    }

    @Override
    public final void run() {
        CommunityEditActivity communityEditActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                communityEditActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
                break;
            default:
                communityEditActivity.lambda$openSetPhotoAlert$7();
                break;
        }
    }
}
