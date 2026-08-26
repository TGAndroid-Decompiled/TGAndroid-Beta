package org.telegram.ui;

import android.view.View;

public final class ChannelCreateActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda5(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChannelCreateActivity channelCreateActivity = this.f$0;
                channelCreateActivity.imageUpdater.openMenu(channelCreateActivity.avatar != null, new ChannelCreateActivity$$ExternalSyntheticLambda1(channelCreateActivity, 2), new OAuthSheet$$ExternalSyntheticLambda11(channelCreateActivity, 6), 0);
                channelCreateActivity.cameraDrawable.setCurrentFrame(0, true, false);
                channelCreateActivity.cameraDrawable.setCustomEndFrame(43);
                channelCreateActivity.avatarEditor.playAnimation();
                break;
            case 1:
                this.f$0.lambda$loadAdminedChannels$19(view);
                break;
            case 2:
                ChannelCreateActivity channelCreateActivity2 = this.f$0;
                if (!channelCreateActivity2.canCreatePublic) {
                    channelCreateActivity2.showPremiumIncreaseLimitDialog();
                    break;
                } else if (channelCreateActivity2.isPrivate) {
                    channelCreateActivity2.isPrivate = false;
                    channelCreateActivity2.updatePrivatePublic();
                    break;
                }
                break;
            default:
                ChannelCreateActivity channelCreateActivity3 = this.f$0;
                if (!channelCreateActivity3.isPrivate) {
                    channelCreateActivity3.isPrivate = true;
                    channelCreateActivity3.updatePrivatePublic();
                    break;
                }
                break;
        }
    }
}
