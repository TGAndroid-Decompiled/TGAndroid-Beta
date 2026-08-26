package org.telegram.ui;

import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.community.CommunityUtils;

public final class ChatActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId = 1;
    public final ChatActivity f$0;
    public final boolean f$1;
    public final int f$2;

    public ChatActivity$$ExternalSyntheticLambda9(int i, ChatActivity chatActivity, boolean z) {
        this.f$2 = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updatePinnedMessageView(this.f$2, this.f$1);
                break;
            default:
                int i = this.f$2;
                ChatActivity chatActivity = this.f$0;
                if (i != 2) {
                    chatActivity.onPageDownClicked();
                    chatActivity.startFireworks();
                }
                CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of(chatActivity), i, this.f$1);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda9(ChatActivity chatActivity, boolean z, int i) {
        this.f$0 = chatActivity;
        this.f$1 = z;
        this.f$2 = i;
    }
}
