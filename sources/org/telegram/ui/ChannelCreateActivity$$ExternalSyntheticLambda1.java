package org.telegram.ui;

public final class ChannelCreateActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda1(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updateDoneProgress(true);
                break;
            case 1:
                ChannelCreateActivity channelCreateActivity = this.f$0;
                channelCreateActivity.canCreatePublic = true;
                channelCreateActivity.updatePrivatePublic();
                break;
            case 2:
                ChannelCreateActivity channelCreateActivity2 = this.f$0;
                channelCreateActivity2.avatar = null;
                channelCreateActivity2.avatarBig = null;
                channelCreateActivity2.inputPhoto = null;
                channelCreateActivity2.inputVideo = null;
                channelCreateActivity2.inputVideoPath = null;
                channelCreateActivity2.inputEmojiMarkup = null;
                channelCreateActivity2.videoTimestamp = 0.0d;
                channelCreateActivity2.showAvatarProgress(false, true);
                channelCreateActivity2.avatarImage.setImage(null, null, channelCreateActivity2.avatarDrawable, null);
                channelCreateActivity2.avatarEditor.setAnimation(channelCreateActivity2.cameraDrawable);
                channelCreateActivity2.cameraDrawable.setCurrentFrame(0, true, false);
                break;
            default:
                ChannelCreateActivity channelCreateActivity3 = this.f$0;
                channelCreateActivity3.canCreatePublic = true;
                if (channelCreateActivity3.descriptionTextView.length() > 0) {
                    channelCreateActivity3.checkUserName$1(channelCreateActivity3.descriptionTextView.getText().toString());
                }
                channelCreateActivity3.updatePrivatePublic();
                break;
        }
    }
}
