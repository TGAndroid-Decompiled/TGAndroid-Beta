package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.web.WebActionBar;

public final class ChatActivity$$ExternalSyntheticLambda488 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;

    public ChatActivity$$ExternalSyntheticLambda488(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = z;
    }

    @Override
    public final void run() {
        Object chat;
        double d;
        int i;
        String str;
        boolean z = this.f$4;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        Object obj4 = this.f$3;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj3;
                chatActivity.getClass();
                ((ChatActivity.AnonymousClass127) obj2).end(false);
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    chatActivity.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    chatActivity.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        chat = chatActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        chat = chatActivity.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    } else {
                        chat = null;
                    }
                } else {
                    chat = null;
                }
                ((ChatActivity$$ExternalSyntheticLambda301) obj4).run(chat, Boolean.valueOf(z));
                break;
            case 1:
                ((FactCheckController) obj3).lambda$applyFactCheck$15((TLObject) obj, (TLRPC.TL_textWithEntities) obj2, z, (AlertDialog) obj4);
                break;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj, (String) obj4, z);
                break;
            case 3:
                ((MessagesController) obj3).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj2, (BaseFragment) obj, (TLRPC.TL_channels_editBanned) obj4, z);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$putChannelViews$191((LongSparseArray) obj2, (LongSparseArray) obj, (LongSparseArray) obj4, z);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$replaceMessageIfExists$234((TLRPC.Message) obj2, z, (ArrayList) obj, (ArrayList) obj4);
                break;
            case 6:
                ((SendMessagesHelper) obj3).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj2, (MessageObject) obj, (BaseFragment) obj4, z);
                break;
            case 7:
                ((SendMessagesHelper) obj3).lambda$performSendMessageRequest$80((TLRPC.Message) obj2, z, (TLObject) obj, (SendMessagesHelper.DelayedMessage) obj4);
                break;
            case 8:
                ((UnconfirmedAuthController) obj3).lambda$updateList$7((boolean[]) obj2, (ArrayList) obj, z, (Utilities.Callback) obj4);
                break;
            case 9:
                ((CameraController) obj3).lambda$recordVideo$12((CameraController.ICameraView) obj2, (File) obj, z, (Runnable) obj4);
                break;
            case 10:
                BusinessLinksController businessLinksController = (BusinessLinksController) obj3;
                ArrayList arrayList = businessLinksController.links;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj2);
                int i2 = businessLinksController.currentAccount;
                MessagesController.getInstance(i2).putUsers((ArrayList) obj, true);
                MessagesController.getInstance(i2).putChats((ArrayList) obj4, true);
                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                businessLinksController.loading = false;
                businessLinksController.load(false, z);
                break;
            case 11:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj3;
                channelMonetizationLayout.getClass();
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj);
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                    twoStepVerificationActivity.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    channelMonetizationLayout.initWithdraw(z, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
                }
                break;
            case 12:
                BlurringShader.ThumbBlurer thumbBlurer = (BlurringShader.ThumbBlurer) obj3;
                Bitmap bitmap = (Bitmap) obj;
                if (TextUtils.equals(thumbBlurer.thumbKey, (String) obj2)) {
                    thumbBlurer.generate = null;
                    Bitmap bitmap2 = thumbBlurer.thumbBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    thumbBlurer.thumbBitmap = bitmap;
                    Runnable runnable = thumbBlurer.invalidate;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap.recycle();
                }
                if (z) {
                    ((Bitmap) obj4).recycle();
                }
                break;
            case 13:
                ((EditTextCaption) obj3).lambda$showInputDialog$4(z, (WebActionBar.AnonymousClass4) obj2, (String) obj, (TextView) obj4);
                break;
            case 14:
                EmojiView.GifSearchPreloader gifSearchPreloader = (EmojiView.GifSearchPreloader) obj3;
                String str2 = (String) obj4;
                gifSearchPreloader.loadingKeys.remove(str2);
                EmojiView emojiView = EmojiView.this;
                EmojiView.GifAdapter gifAdapter = emojiView.gifSearchAdapter;
                boolean z2 = gifAdapter.lastSearchIsEmoji;
                String str3 = (String) obj2;
                boolean z3 = this.f$4;
                TLObject tLObject2 = (TLObject) obj;
                if (z2 && gifAdapter.lastSearchImageString.equals(str3)) {
                    emojiView.gifSearchAdapter.processResponse(str3, "", false, true, z3, str2, tLObject2);
                } else if (z3 && (!(tLObject2 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject2).results.isEmpty())) {
                    gifSearchPreloader.preload(str3, false);
                } else if (tLObject2 instanceof TLRPC.messages_BotResults) {
                    HashMap map = emojiView.gifCache;
                    if (!map.containsKey(str2)) {
                        map.put(str2, (TLRPC.messages_BotResults) tLObject2);
                    }
                }
                break;
            case 15:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj3;
                boolean z4 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                BaseFragment baseFragment = (BaseFragment) obj4;
                boolean z5 = this.f$4;
                String str4 = (String) obj2;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj;
                if (z4) {
                    BoostDialogs.showAbout(z5, str4, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
                } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                    BoostDialogs.showAboutEnd(z5, str4, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, baseFragment.getParentActivity(), baseFragment.getResourceProvider());
                }
                break;
            case 16:
                BaseFragment baseFragment2 = (BaseFragment) obj2;
                File fileMakeCacheFile = StoryEntry.makeCacheFile(baseFragment2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f = 512;
                float fFloor = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d2 = (fFloor * f) / f;
                if (((float) Math.floor(d2)) > fFloor) {
                    fFloor = (float) Math.floor(d2);
                }
                float f2 = fFloor;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                bitmapCreateBitmap.recycle();
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                mediaEntity.parentObject = tL_messages_stickerSet;
                TLRPC.Document document = (TLRPC.Document) obj4;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                mediaEntity.x = 0.5f - ((Math.min(512, 512) / f) / 2.0f);
                mediaEntity.y = 0.5f - ((Math.min(512, 512) / f) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f;
                mediaEntity.height = Math.min(512, 512) / f;
                int iFloor = (int) Math.floor(((double) f2) * 0.5d);
                mediaEntity.viewWidth = iFloor;
                mediaEntity.viewHeight = iFloor;
                mediaEntity.scale = 2.0f;
                mediaEntity.document = document;
                if (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoStickerDocument(document)) {
                    mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
                }
                ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList3;
                arrayList3.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
                            if (rLottieNativeCreateFromFile != null) {
                                int[] iArr = rLottieNativeCreateFromFile.mMetaData;
                                int i3 = iArr[0];
                                int i4 = iArr[1];
                                rLottieNativeCreateFromFile.recycle();
                                d = ((double) i3) / ((double) i4);
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.getInstance().setParentActivity(baseFragment2.getParentActivity(), null, baseFragment2.getResourceProvider());
                PhotoViewer.getInstance().openPhotoForSelect(arrayList2, 0, 11, false, new StickersAlert.AnonymousClass3(), (ChatActivity) obj3);
                PhotoViewer.getInstance().enableStickerMode(document, z ? document : null, true, null);
                ContentPreviewViewer.getInstance().stickerSetForCustomSticker = z ? tL_messages_stickerSet : null;
                break;
            case 17:
                DialogsActivity dialogsActivity = DialogsActivity.this;
                if (((TLRPC.TL_error) obj2) == null) {
                    TLRPC.User user = dialogsActivity.getMessagesController().getUser(Long.valueOf(dialogsActivity.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = dialogsActivity.getUserConfig().getCurrentUser();
                        if (user != null) {
                            dialogsActivity.getMessagesController().putUser(user, false);
                        }
                    } else {
                        dialogsActivity.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) ((TLObject) obj);
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 150);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
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
                    if (closestPhotoSizeWithSize != null && dialogsActivity.avatar != null) {
                        FileLoader.getInstance(((BaseFragment) dialogsActivity).currentAccount).getPathToAttach(dialogsActivity.avatar, true).renameTo(FileLoader.getInstance(((BaseFragment) dialogsActivity).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(dialogsActivity.avatar.volume_id);
                        sb.append("_");
                        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(dialogsActivity.avatar.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(((BaseFragment) dialogsActivity).currentAccount, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && (str = (String) obj4) != null) {
                        new File(str).renameTo(FileLoader.getInstance(((BaseFragment) dialogsActivity).currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && dialogsActivity.avatarBig != null) {
                        FileLoader.getInstance(((BaseFragment) dialogsActivity).currentAccount).getPathToAttach(dialogsActivity.avatarBig, true).renameTo(FileLoader.getInstance(((BaseFragment) dialogsActivity).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    dialogsActivity.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i = 0;
                    dialogsActivity.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = dialogsActivity.getMessagesController().getUserFull(dialogsActivity.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        dialogsActivity.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z = z;
                    i = 0;
                }
                dialogsActivity.avatar = null;
                dialogsActivity.avatarBig = null;
                NotificationCenter notificationCenter = dialogsActivity.getNotificationCenter();
                int i5 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i5, objArr);
                dialogsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i]);
                dialogsActivity.getUserConfig().saveConfig(true);
                MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
                dialogsActivity.updateDialogsHint();
                Bulletin bulletin = dialogsActivity.uploadingAvatarBulletin;
                if (bulletin != null) {
                    Bulletin.ProgressLayout progressLayout = (Bulletin.ProgressLayout) bulletin.layout;
                    progressLayout.textView.setText(LocaleController.getString(z ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    progressLayout.setProgress(1.0f);
                    Bulletin.Button button = progressLayout.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    OKLCH.m(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 360L);
                    Bulletin bulletin2 = dialogsActivity.uploadingAvatarBulletin;
                    bulletin2.duration = 5000;
                    bulletin2.setCanHide(false);
                    dialogsActivity.uploadingAvatarBulletin.setCanHide(true);
                }
                break;
            case 18:
                ((PaymentFormActivity) obj3).lambda$sendSavePassword$48(z, (String) obj2, (String) obj, (TL_account.updatePasswordSettings) obj4);
                break;
            case 19:
                ((PaymentFormActivity) obj3).lambda$sendSavePassword$46((String) obj4, z, (TLObject) obj, (TLRPC.TL_error) obj2);
                break;
            case 20:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter2 = (EmojiBottomSheet.GifPage.GifAdapter) obj3;
                if (gifAdapter2.requesting) {
                    TLObject tLObject3 = (TLObject) obj;
                    boolean z6 = tLObject3 instanceof TLRPC.messages_BotResults;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    if (!z6) {
                        gifAdapter2.currentReqId = ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).sendRequest((TLRPC.TL_messages_getInlineBotResults) obj2, new DialogsActivity$50$$ExternalSyntheticLambda2(gifAdapter2, (String) obj4, z, 8));
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        gifAdapter2.offset = messages_botresults.next_offset;
                        if (z) {
                            gifPage.gifs.clear();
                        }
                        gifPage.gifs.size();
                        gifPage.gifs.addAll(messages_botresults.results);
                        gifAdapter2.mObservable.notifyChanged();
                        gifPage.searchField.showProgress(false);
                        gifAdapter2.requesting = false;
                    }
                    break;
                }
                break;
            case 21:
                Bitmap bitmap3 = (Bitmap) obj2;
                File file = (File) obj;
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                storyRecorder.getClass();
                try {
                    bitmap3.compress(Bitmap.CompressFormat.JPEG, z ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(storyRecorder, (StoryEntry) obj4, file, 16));
                break;
            case 22:
                ((TwoStepVerificationSetupActivity) obj3).lambda$setNewPassword$50((TLObject) obj, z, (String) obj2, (TL_account.passwordInputSettings) obj4);
                break;
            default:
                RichInlineButtonEditor.showBlockProfileDialog((BaseFragment) obj3, (Context) obj2, (Theme.ResourcesProvider) obj, (RichEditorListView.BlockButtonEdit) obj4, z);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda488(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = z;
        this.f$3 = obj4;
    }

    public ChatActivity$$ExternalSyntheticLambda488(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = z;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public ChatActivity$$ExternalSyntheticLambda488(Object obj, TLObject tLObject, boolean z, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = tLObject;
        this.f$4 = z;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    public ChatActivity$$ExternalSyntheticLambda488(Object obj, boolean z, Object obj2, String str, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$4 = z;
        this.f$1 = obj2;
        this.f$2 = str;
        this.f$3 = obj3;
    }

    public ChatActivity$$ExternalSyntheticLambda488(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, AlertDialog alertDialog) {
        this.$r8$classId = 1;
        this.f$0 = factCheckController;
        this.f$2 = tLObject;
        this.f$1 = tL_textWithEntities;
        this.f$4 = z;
        this.f$3 = alertDialog;
    }

    public ChatActivity$$ExternalSyntheticLambda488(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, BaseFragment baseFragment) {
        this.$r8$classId = 15;
        this.f$0 = payments_giveawayinfo;
        this.f$4 = z;
        this.f$1 = str;
        this.f$2 = tL_messageMediaGiveaway;
        this.f$3 = baseFragment;
    }

    public ChatActivity$$ExternalSyntheticLambda488(BaseFragment baseFragment, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document, ChatActivity chatActivity, boolean z) {
        this.$r8$classId = 16;
        this.f$1 = baseFragment;
        this.f$2 = tL_messages_stickerSet;
        this.f$3 = document;
        this.f$0 = chatActivity;
        this.f$4 = z;
    }

    public ChatActivity$$ExternalSyntheticLambda488(EmojiView.GifSearchPreloader gifSearchPreloader, String str, boolean z, String str2, TLObject tLObject) {
        this.$r8$classId = 14;
        this.f$0 = gifSearchPreloader;
        this.f$1 = str;
        this.f$4 = z;
        this.f$3 = str2;
        this.f$2 = tLObject;
    }
}
