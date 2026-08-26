package org.telegram.ui.Components;

import android.content.Context;

public final class GroupCallPipAlertView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;

    public GroupCallPipAlertView$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupCallPip.updateVisibility(this.f$0);
                break;
            case 1:
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$8(this.f$0);
                break;
            case 2:
                StickerSetBulletinLayout.lambda$new$1(this.f$0);
                break;
            default:
                StickerSetBulletinLayout.lambda$new$0(this.f$0);
                break;
        }
    }
}
