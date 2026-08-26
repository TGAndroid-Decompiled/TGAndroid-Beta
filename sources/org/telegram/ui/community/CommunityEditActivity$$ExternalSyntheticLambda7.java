package org.telegram.ui.community;

import org.telegram.ui.ChatActivity;

public final class CommunityEditActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final CommunityEditActivity f$0;
    public final long f$1;

    public CommunityEditActivity$$ExternalSyntheticLambda7(CommunityEditActivity communityEditActivity, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = communityEditActivity;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CommunityEditActivity communityEditActivity = this.f$0;
                communityEditActivity.getClass();
                communityEditActivity.presentFragment(ChatActivity.of(this.f$1));
                break;
            default:
                this.f$0.lambda$onLongClick$4(this.f$1);
                break;
        }
    }
}
