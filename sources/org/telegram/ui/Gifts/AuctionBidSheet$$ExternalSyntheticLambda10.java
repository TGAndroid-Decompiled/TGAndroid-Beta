package org.telegram.ui.Gifts;

import org.telegram.ui.ChatActivity;
import org.telegram.ui.TopicsFragment;

public final class AuctionBidSheet$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public AuctionBidSheet$$ExternalSyntheticLambda10(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.startFireworks();
                break;
            default:
                ChatActivity chatActivity = this.f$0;
                if (chatActivity.getParentLayout() != null) {
                    TopicsFragment.prepareToSwitchAnimation(chatActivity);
                }
                break;
        }
    }
}
