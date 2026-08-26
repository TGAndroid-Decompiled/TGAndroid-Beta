package org.telegram.ui;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieDrawable;

public final class ChatEditActivity$$ExternalSyntheticLambda49 implements Runnable {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda49(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openSetPhotoAlert$55();
                break;
            case 1:
                this.f$0.lambda$didUploadPhoto$57();
                break;
            case 2:
                ChatEditActivity chatEditActivity = this.f$0;
                chatEditActivity.progressDialog.dismiss();
                chatEditActivity.finishFragment();
                break;
            case 3:
                ChatEditActivity chatEditActivity2 = this.f$0;
                chatEditActivity2.autoTranslationCell.setChecked(chatEditActivity2.currentChat.autotranslation);
                break;
            default:
                ChatEditActivity chatEditActivity3 = this.f$0;
                chatEditActivity3.avatarImage.setImageDrawable(chatEditActivity3.avatarDrawable);
                chatEditActivity3.setAvatarCell.setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = chatEditActivity3.currentUser;
                if (user != null) {
                    user.photo = null;
                    chatEditActivity3.getMessagesController().putUser(chatEditActivity3.currentUser, true);
                }
                chatEditActivity3.hasUploadedPhoto = true;
                if (chatEditActivity3.cameraDrawable == null) {
                    int i = R.raw.camera_outline;
                    chatEditActivity3.cameraDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                chatEditActivity3.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                chatEditActivity3.setAvatarCell.imageView.setAnimation(chatEditActivity3.cameraDrawable);
                break;
        }
    }
}
