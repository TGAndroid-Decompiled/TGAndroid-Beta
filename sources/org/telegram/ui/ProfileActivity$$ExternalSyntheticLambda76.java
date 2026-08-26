package org.telegram.ui;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.community.CommunityEditActivity;

public final class ProfileActivity$$ExternalSyntheticLambda76 implements Runnable {
    public final int $r8$classId;
    public final ImageUpdater.ImageUpdaterDelegate f$0;
    public final TLRPC.InputFile f$1;
    public final TLRPC.InputFile f$2;
    public final TLRPC.VideoSize f$3;
    public final double f$4;
    public final String f$5;
    public final TLRPC.PhotoSize f$6;
    public final TLRPC.PhotoSize f$7;

    public ProfileActivity$$ExternalSyntheticLambda76(BaseFragment baseFragment, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i) {
        this.$r8$classId = i;
        this.f$0 = (ImageUpdater.ImageUpdaterDelegate) baseFragment;
        this.f$1 = inputFile;
        this.f$2 = inputFile2;
        this.f$3 = videoSize;
        this.f$5 = str;
        this.f$4 = d;
        this.f$6 = photoSize;
        this.f$7 = photoSize2;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$didUploadPhoto$113(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            case 1:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$0;
                channelCreateActivity.getClass();
                TLRPC.InputFile inputFile = this.f$1;
                TLRPC.InputFile inputFile2 = this.f$2;
                if (inputFile == null && inputFile2 == null) {
                    TLRPC.FileLocation fileLocation = this.f$6.location;
                    channelCreateActivity.avatar = fileLocation;
                    channelCreateActivity.avatarBig = this.f$7.location;
                    channelCreateActivity.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", channelCreateActivity.avatarDrawable, null);
                    channelCreateActivity.showAvatarProgress(true, false);
                } else {
                    channelCreateActivity.inputPhoto = inputFile;
                    channelCreateActivity.inputVideo = inputFile2;
                    channelCreateActivity.inputEmojiMarkup = this.f$3;
                    channelCreateActivity.inputVideoPath = this.f$5;
                    channelCreateActivity.videoTimestamp = this.f$4;
                    if (channelCreateActivity.createAfterUpload) {
                        AlertDialog alertDialog = channelCreateActivity.cancelDialog;
                        if (alertDialog != null) {
                            try {
                                alertDialog.dismiss();
                                channelCreateActivity.cancelDialog = null;
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        channelCreateActivity.updateDoneProgress(false);
                        channelCreateActivity.donePressed = false;
                        channelCreateActivity.doneButton.performClick();
                    }
                    channelCreateActivity.showAvatarProgress(false, true);
                    channelCreateActivity.avatarEditor.setImageDrawable(null);
                }
                break;
            case 2:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                chatEditActivity.getClass();
                TLRPC.PhotoSize photoSize = this.f$6;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                chatEditActivity.avatar = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f$1;
                TLRPC.InputFile inputFile4 = this.f$2;
                TLRPC.VideoSize videoSize = this.f$3;
                if (inputFile3 == null && inputFile4 == null && videoSize == null) {
                    UserCell.AnonymousClass2 anonymousClass2 = chatEditActivity.avatarImage;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    AvatarDrawable avatarDrawable = chatEditActivity.avatarDrawable;
                    Object obj = chatEditActivity.currentUser;
                    if (obj == null) {
                        obj = chatEditActivity.currentChat;
                    }
                    anonymousClass2.setImage(forLocal, "50_50", avatarDrawable, obj);
                    chatEditActivity.setAvatarCell.setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (chatEditActivity.cameraDrawable == null) {
                        int i = R.raw.camera_outline;
                        chatEditActivity.cameraDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    chatEditActivity.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                    chatEditActivity.setAvatarCell.imageView.setAnimation(chatEditActivity.cameraDrawable);
                    chatEditActivity.showAvatarProgress$1(true, false);
                } else {
                    TLRPC.PhotoSize photoSize2 = this.f$7;
                    double d = this.f$4;
                    long j = 0;
                    if (chatEditActivity.userId != 0) {
                        TLRPC.User user = chatEditActivity.currentUser;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = chatEditActivity.currentUser.photo;
                            if (inputFile3 != null) {
                                j = inputFile3.id;
                            } else if (inputFile4 != null) {
                                j = inputFile4.id;
                            }
                            userProfilePhoto.photo_id = j;
                            userProfilePhoto.photo_big = photoSize2.location;
                            userProfilePhoto.photo_small = photoSize.location;
                            chatEditActivity.getMessagesController().putUser(chatEditActivity.currentUser, true);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile3 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile3;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile4 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile4;
                            int i2 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d;
                            tL_photos_uploadProfilePhoto.flags = i2 | 6;
                        }
                        if (videoSize != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = chatEditActivity.getMessagesController().getInputUser(chatEditActivity.currentUser);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        chatEditActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ChatEditActivity$$ExternalSyntheticLambda40(chatEditActivity, 1));
                        z = false;
                    } else {
                        MessagesController messagesController = chatEditActivity.getMessagesController();
                        long j2 = chatEditActivity.chatId;
                        TLRPC.FileLocation fileLocation3 = photoSize.location;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        z = false;
                        messagesController.changeChatAvatar(j2, null, inputFile3, inputFile4, videoSize, d, this.f$5, fileLocation3, fileLocation4, null);
                    }
                    if (chatEditActivity.createAfterUpload) {
                        try {
                            AlertDialog alertDialog2 = chatEditActivity.progressDialog;
                            if (alertDialog2 != null && alertDialog2.isShowing()) {
                                chatEditActivity.progressDialog.dismiss();
                                chatEditActivity.progressDialog = null;
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        chatEditActivity.donePressed = z;
                        chatEditActivity.doneButton.performClick();
                    }
                    chatEditActivity.showAvatarProgress$1(z, true);
                }
                break;
            case 3:
                GroupCallActivity.AvatarUpdaterDelegate avatarUpdaterDelegate = (GroupCallActivity.AvatarUpdaterDelegate) this.f$0;
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                TLRPC.InputFile inputFile5 = this.f$1;
                TLRPC.InputFile inputFile6 = this.f$2;
                TLRPC.VideoSize videoSize2 = this.f$3;
                TLRPC.PhotoSize photoSize3 = this.f$6;
                TLRPC.PhotoSize photoSize4 = this.f$7;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    avatarUpdaterDelegate.avatar = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    avatarUpdaterDelegate.avatarBig = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    avatarUpdaterDelegate.uploadingImageLocation = forLocal2;
                    groupCallActivity.avatarsViewPager.addUploadingImage(forLocal2, ImageLocation.getForLocal(avatarUpdaterDelegate.avatar));
                    AndroidUtilities.updateVisibleRows(groupCallActivity.listView);
                } else {
                    double d2 = this.f$4;
                    String str = this.f$5;
                    long j3 = avatarUpdaterDelegate.peerId;
                    if (j3 <= 0) {
                        groupCallActivity.accountInstance.getMessagesController().changeChatAvatar(-j3, null, inputFile5, inputFile6, videoSize2, d2, str, photoSize3.location, photoSize4.location, new IntroActivity$$ExternalSyntheticLambda6(avatarUpdaterDelegate, 4));
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile5;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile6;
                            int i3 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d2;
                            tL_photos_uploadProfilePhoto2.flags = i3 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        groupCallActivity.accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new LinkManager$$ExternalSyntheticLambda8(19, avatarUpdaterDelegate, str));
                    }
                }
                break;
            case 4:
                GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.f$0;
                groupCreateFinalActivity.getClass();
                TLRPC.InputFile inputFile7 = this.f$1;
                TLRPC.InputFile inputFile8 = this.f$2;
                TLRPC.VideoSize videoSize3 = this.f$3;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    TLRPC.FileLocation fileLocation6 = this.f$6.location;
                    groupCreateFinalActivity.avatar = fileLocation6;
                    groupCreateFinalActivity.avatarBig = this.f$7.location;
                    groupCreateFinalActivity.avatarImage.setImage(ImageLocation.getForLocal(fileLocation6), "50_50", groupCreateFinalActivity.avatarDrawable, null);
                    groupCreateFinalActivity.showAvatarProgress$3(true, false);
                } else {
                    groupCreateFinalActivity.inputPhoto = inputFile7;
                    groupCreateFinalActivity.inputVideo = inputFile8;
                    groupCreateFinalActivity.inputEmojiMarkup = videoSize3;
                    groupCreateFinalActivity.inputVideoPath = this.f$5;
                    groupCreateFinalActivity.videoTimestamp = this.f$4;
                    if (groupCreateFinalActivity.createAfterUpload) {
                        groupCreateFinalActivity.getMessagesController().createChat(groupCreateFinalActivity.editText.getText().toString(), groupCreateFinalActivity.selectedContacts, null, groupCreateFinalActivity.chatType, groupCreateFinalActivity.forImport, groupCreateFinalActivity.currentGroupCreateLocation, groupCreateFinalActivity.currentGroupCreateAddress, groupCreateFinalActivity.ttlPeriod, groupCreateFinalActivity);
                    }
                    groupCreateFinalActivity.showAvatarProgress$3(false, true);
                    groupCreateFinalActivity.avatarEditor.setImageDrawable(null);
                }
                break;
            case 5:
                ((SettingsActivity) this.f$0).lambda$didUploadPhoto$24(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            default:
                CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.f$0;
                communityEditActivity.getClass();
                TLRPC.PhotoSize photoSize5 = this.f$6;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                communityEditActivity.avatar = fileLocation7;
                TLRPC.InputFile inputFile9 = this.f$1;
                TLRPC.InputFile inputFile10 = this.f$2;
                TLRPC.VideoSize videoSize4 = this.f$3;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    communityEditActivity.avatarImage.setImage(ImageLocation.getForLocal(fileLocation7), "50_50", communityEditActivity.avatarDrawable, communityEditActivity.currentChat);
                    communityEditActivity.showAvatarProgress$6(true, false);
                    z2 = true;
                } else {
                    z2 = true;
                    communityEditActivity.getMessagesController().changeChatAvatar(communityEditActivity.communityId, null, inputFile9, inputFile10, videoSize4, this.f$4, this.f$5, photoSize5.location, this.f$7.location, null);
                    communityEditActivity.showAvatarProgress$6(false, true);
                }
                communityEditActivity.listView.adapter.update(z2);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda76(ChatEditActivity chatEditActivity, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.$r8$classId = 2;
        this.f$0 = chatEditActivity;
        this.f$6 = photoSize;
        this.f$1 = inputFile;
        this.f$2 = inputFile2;
        this.f$3 = videoSize;
        this.f$7 = photoSize2;
        this.f$4 = d;
        this.f$5 = str;
    }

    public ProfileActivity$$ExternalSyntheticLambda76(ImageUpdater.ImageUpdaterDelegate imageUpdaterDelegate, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i) {
        this.$r8$classId = i;
        this.f$0 = imageUpdaterDelegate;
        this.f$1 = inputFile;
        this.f$2 = inputFile2;
        this.f$3 = videoSize;
        this.f$4 = d;
        this.f$5 = str;
        this.f$6 = photoSize;
        this.f$7 = photoSize2;
    }

    public ProfileActivity$$ExternalSyntheticLambda76(CommunityEditActivity communityEditActivity, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.$r8$classId = 6;
        this.f$0 = communityEditActivity;
        this.f$6 = photoSize;
        this.f$1 = inputFile;
        this.f$2 = inputFile2;
        this.f$3 = videoSize;
        this.f$4 = d;
        this.f$5 = str;
        this.f$7 = photoSize2;
    }
}
