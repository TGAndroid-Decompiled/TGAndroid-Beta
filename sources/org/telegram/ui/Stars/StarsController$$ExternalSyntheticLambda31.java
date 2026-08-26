package org.telegram.ui.Stars;

import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.community.CommunityUtils;

public final class StarsController$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final boolean f$1;
    public final int f$2;

    public StarsController$$ExternalSyntheticLambda31(int i, ChatActivity chatActivity, boolean z) {
        this.f$2 = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = (StarsController) this.f$0;
                if (!this.f$1) {
                    starsController.getClass();
                } else {
                    int i = this.f$2;
                    starsController.sendingPaidMessagesIds.remove(Integer.valueOf(i));
                    Runnable runnable = (Runnable) starsController.postponedPaidMessages.remove(Integer.valueOf(i));
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            default:
                int i2 = this.f$2;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                if (i2 != 2) {
                    chatActivity.onPageDownClicked();
                    chatActivity.startFireworks();
                }
                CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of(chatActivity), i2, this.f$1);
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda31(StarsController starsController, boolean z, int i) {
        this.f$0 = starsController;
        this.f$1 = z;
        this.f$2 = i;
    }
}
