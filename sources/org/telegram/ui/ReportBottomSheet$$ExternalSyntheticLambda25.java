package org.telegram.ui;

import android.content.Context;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.PhotoUtilities$$ExternalSyntheticLambda5;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.InviteLinkBottomSheet;

public final class ReportBottomSheet$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId = 2;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public ReportBottomSheet$$ExternalSyntheticLambda25(long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.f$1 = conferenceCall;
        this.f$2 = getgroupcallchainblocks;
        this.f$3 = j;
        this.f$0 = tLObject;
        this.f$4 = tL_error;
        this.f$5 = atomicBoolean;
        this.f$6 = atomicInteger;
    }

    @Override
    public final void run() {
        String str;
        switch (this.$r8$classId) {
            case 0:
                ReportBottomSheet.lambda$openSponsored$9((TLObject) this.f$0, (Context) this.f$1, (Theme.ResourcesProvider) this.f$2, this.f$3, (byte[]) this.f$4, (ChatActivity) this.f$5, (MessageObject) this.f$6);
                break;
            case 1:
                if (((TLRPC.TL_error) this.f$1) == null) {
                    ChatActivity chatActivity = (ChatActivity) this.f$5;
                    TLRPC.User user = chatActivity.getMessagesController().getUser(Long.valueOf(chatActivity.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) ((TLObject) this.f$0);
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                    TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f$2;
                        if (fileLocationArr[0] != null) {
                            FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(fileLocationArr[0].volume_id);
                            sb.append("_");
                            String strM = Fragment$$ExternalSyntheticOutline0.m(fileLocationArr[0].local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(chatActivity.getCurrentAccount(), user, 1), false);
                        }
                    }
                    if (closestVideoSizeWithSize != null && (str = (String) this.f$4) != null) {
                        new File(str).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null) {
                        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f$6;
                        if (fileLocationArr2[0] != null) {
                            FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(chatActivity.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                        }
                    }
                    chatActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    chatActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = chatActivity.getMessagesController();
                    long j = this.f$3;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j);
                    userFull.profile_photo = tL_photos_photo.photo;
                    chatActivity.getMessagesStorage().updateUserInfo(userFull, false);
                    BulletinFactory.of(chatActivity).createUsersBulletin(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new PhotoUtilities$$ExternalSyntheticLambda5(j, chatActivity)), null).show();
                }
                break;
            case 2:
                ((ConferenceCall) this.f$1).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f$2, this.f$3, (TLObject) this.f$0, (TLRPC.TL_error) this.f$4, (AtomicBoolean) this.f$5, (AtomicInteger) this.f$6);
                break;
            default:
                ((InviteLinkBottomSheet) this.f$0).lambda$new$0((AlertDialog) this.f$2, (Context) this.f$1, this.f$3, (TLRPC.TL_chatInviteExported) this.f$4, (TLRPC.TL_chatInviteImporter) this.f$5, (TLRPC.ChannelParticipant) this.f$6);
                break;
        }
    }

    public ReportBottomSheet$$ExternalSyntheticLambda25(TLObject tLObject, Context context, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, ChatActivity chatActivity, MessageObject messageObject) {
        this.f$0 = tLObject;
        this.f$1 = context;
        this.f$2 = resourcesProvider;
        this.f$3 = j;
        this.f$4 = bArr;
        this.f$5 = chatActivity;
        this.f$6 = messageObject;
    }

    public ReportBottomSheet$$ExternalSyntheticLambda25(TLRPC.TL_error tL_error, ChatActivity chatActivity, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.f$1 = tL_error;
        this.f$5 = chatActivity;
        this.f$0 = tLObject;
        this.f$2 = fileLocationArr;
        this.f$4 = str;
        this.f$6 = fileLocationArr2;
        this.f$3 = j;
    }

    public ReportBottomSheet$$ExternalSyntheticLambda25(InviteLinkBottomSheet inviteLinkBottomSheet, AlertDialog alertDialog, Context context, long j, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.f$0 = inviteLinkBottomSheet;
        this.f$2 = alertDialog;
        this.f$1 = context;
        this.f$3 = j;
        this.f$4 = tL_chatInviteExported;
        this.f$5 = tL_chatInviteImporter;
        this.f$6 = channelParticipant;
    }
}
