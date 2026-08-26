package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
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
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class ReportBottomSheet$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public ReportBottomSheet$$ExternalSyntheticLambda15(long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.$r8$classId = 2;
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
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f$0);
                final Activity activity = (Activity) this.f$1;
                long j = this.f$3;
                byte[] bArr = (byte[]) this.f$4;
                final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$2;
                ReportBottomSheet reportBottomSheet = new ReportBottomSheet(activity, resourcesProvider, j, bArr);
                reportBottomSheet.setReportChooseOption(tL_channels_sponsoredMessageReportResultChooseOption);
                final ChatActivity chatActivity = (ChatActivity) this.f$5;
                final MessageObject messageObject = (MessageObject) this.f$6;
                reportBottomSheet.listener = new ReportBottomSheet.Listener() {
                    public final Activity val$context;
                    public final MessageObject val$message;
                    public final Theme.ResourcesProvider val$resourceProvider;

                    public AnonymousClass4() {
                        activity = activity;
                        resourcesProvider = resourcesProvider;
                        messageObject = messageObject;
                    }

                    @Override
                    public final void onHidden() {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda6(chatActivity, messageObject, 8), 200L);
                    }

                    @Override
                    public final void onPremiumRequired() {
                        ChatActivity chatActivity2 = chatActivity;
                        chatActivity2.showDialog(new PremiumFeatureBottomSheet((BaseFragment) chatActivity2, 3, true));
                    }

                    @Override
                    public final void onReported() {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda16(chatActivity, activity, resourcesProvider, messageObject, 2), 200L);
                    }
                };
                reportBottomSheet.show();
                break;
            case 1:
                if (((TLRPC.TL_error) this.f$1) == null) {
                    ChatActivity chatActivity2 = (ChatActivity) this.f$5;
                    TLRPC.User user = chatActivity2.getMessagesController().getUser(Long.valueOf(chatActivity2.getUserConfig().getClientUserId()));
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
                            FileLoader.getInstance(chatActivity2.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(chatActivity2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(fileLocationArr[0].volume_id);
                            sb.append("_");
                            String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(fileLocationArr[0].local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(chatActivity2.getCurrentAccount(), user, 1), false);
                        }
                    }
                    if (closestVideoSizeWithSize != null && (str = (String) this.f$4) != null) {
                        new File(str).renameTo(FileLoader.getInstance(chatActivity2.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null) {
                        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f$6;
                        if (fileLocationArr2[0] != null) {
                            FileLoader.getInstance(chatActivity2.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(chatActivity2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                        }
                    }
                    chatActivity2.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    chatActivity2.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = chatActivity2.getMessagesController();
                    long j2 = this.f$3;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j2);
                    userFull.profile_photo = tL_photos_photo.photo;
                    chatActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                    BulletinFactory.of(chatActivity2).createUsersBulletin(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ChatActivity$$ExternalSyntheticLambda103(j2, chatActivity2)), null).show();
                }
                break;
            case 2:
                ((ConferenceCall) this.f$1).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f$2, this.f$3, (TLObject) this.f$0, (TLRPC.TL_error) this.f$4, (AtomicBoolean) this.f$5, (AtomicInteger) this.f$6);
                break;
            default:
                ((InviteLinkBottomSheet) this.f$0).lambda$new$0((AlertDialog) this.f$1, (Context) this.f$2, this.f$3, (TLRPC.TL_chatInviteExported) this.f$4, (TLRPC.TL_chatInviteImporter) this.f$5, (TLRPC.ChannelParticipant) this.f$6);
                break;
        }
    }

    public ReportBottomSheet$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, long j, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$6 = obj6;
    }

    public ReportBottomSheet$$ExternalSyntheticLambda15(TLRPC.TL_error tL_error, ChatActivity chatActivity, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.$r8$classId = 1;
        this.f$1 = tL_error;
        this.f$5 = chatActivity;
        this.f$0 = tLObject;
        this.f$2 = fileLocationArr;
        this.f$4 = str;
        this.f$6 = fileLocationArr2;
        this.f$3 = j;
    }
}
