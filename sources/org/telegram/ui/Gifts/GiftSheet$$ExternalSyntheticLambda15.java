package org.telegram.ui.Gifts;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.location.Location;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationCenter$$ExternalSyntheticLambda2;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView.SegmentedObject;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftSheet$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public GiftSheet$$ExternalSyntheticLambda15(int i, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.$r8$classId = 10;
        this.f$2 = i;
        this.f$0 = chat;
        this.f$1 = arrayList;
        this.f$3 = arrayList2;
        this.f$4 = arrayList3;
    }

    @Override
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        StickerMakerView.SegmentedObject segmentedObject = null;
        switch (this.$r8$classId) {
            case 0:
                final GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                final GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10 = new GiftSheet$$ExternalSyntheticLambda10(giftSheet, (Utilities.Callback) this.f$4, 2);
                final TL_stars.StarGift starGift = (TL_stars.StarGift) this.f$3;
                boolean z = starGift.limited;
                final boolean z2 = z && (disallowedGiftsSettings2 = giftSheet.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts;
                final boolean z3 = z && (disallowedGiftsSettings = giftSheet.userSettings) != null && disallowedGiftsSettings.disallow_unique_stargifts;
                final Context context = (Context) this.f$1;
                final int i = this.f$2;
                final long j = giftSheet.dialogId;
                new SendGiftSheet(context, i, starGift, j, giftSheet$$ExternalSyntheticLambda10, z2, z3) {
                    public AnonymousClass10(final Context context2, final int i2, final TL_stars.StarGift starGift2, final long j2, final GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda11, final boolean z4, final boolean z5) {
                        super(context2, i2, starGift2, null, j2, giftSheet$$ExternalSyntheticLambda11, z4, z5);
                    }

                    @Override
                    public final BulletinFactory getParentBulletinFactory() {
                        GiftSheet giftSheet2 = GiftSheet.this;
                        return BulletinFactory.of(giftSheet2.container, giftSheet2.resourcesProvider);
                    }
                }.show();
                break;
            case 1:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f$0, (Location) this.f$1, this.f$2, (Locale) this.f$3, (LocationController.LocationFetchCallback) this.f$4);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$removeMultipleStickerSets$110((boolean[]) this.f$1, (ArrayList) this.f$3, this.f$2, (int[]) this.f$4);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$processUpdateArray$403((EphemeralMessagesHelper.EphemeralUpdates.StructBuilder) this.f$1, (ConcurrentHashMap) this.f$3, (ConcurrentHashMap) this.f$4, this.f$2);
                break;
            case 4:
                ((MessagesStorage) this.f$0).lambda$getSentFile$164((String) this.f$1, this.f$2, (Object[]) this.f$3, (CountDownLatch) this.f$4);
                break;
            case 5:
                ((MessagesStorage) this.f$0).lambda$putSentFile$170((String) this.f$1, (TLObject) this.f$3, this.f$2, (String) this.f$4);
                break;
            case 6:
                ((NotificationCenter) this.f$0).lambda$listen$5((View) this.f$1, (View.OnAttachStateChangeListener) this.f$3, (NotificationCenter$$ExternalSyntheticLambda2) this.f$4, this.f$2);
                break;
            case 7:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$33((TLObject) this.f$1, this.f$2, (String) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 8:
                ((DialogsSearchAdapter) this.f$0).lambda$updateSearchResults$15(this.f$2, (ArrayList) this.f$1, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 9:
                ((SearchAdapter) this.f$0).lambda$updateSearchResults$2(this.f$2, (ArrayList) this.f$1, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 10:
                AlertsCreator.lambda$checkRestrictedInviteUsers$98(this.f$2, (TLRPC.Chat) this.f$0, (ArrayList) this.f$1, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 11:
                AlertsCreator.lambda$createDeleteMessagesAlert$231((AlertDialog[]) this.f$0, (int[]) this.f$1, this.f$2, (Runnable) this.f$3, (BaseFragment) this.f$4);
                break;
            case 12:
                AlertsCreator.lambda$performAskAQuestion$48((SharedPreferences) this.f$0, (TLRPC.TL_help_support) this.f$1, (AlertDialog) this.f$3, this.f$2, (BaseFragment) this.f$4);
                break;
            case 13:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$updateParticipantMessageCounts$6((TLObject) this.f$1, (TLRPC.InputPeer) this.f$3, this.f$2, (int[]) this.f$4);
                break;
            case 14:
                ((JoinGroupAlert) this.f$0).lambda$new$10((TLRPC.TL_error) this.f$1, (TLRPC.Updates) this.f$3, this.f$2, (TLRPC.TL_messages_importChatInvite) this.f$4);
                break;
            case 15:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                int i2 = this.f$2;
                List list = (List) this.f$1;
                ArrayList arrayList = (ArrayList) this.f$3;
                PhotoViewer$$ExternalSyntheticLambda65 photoViewer$$ExternalSyntheticLambda65 = (PhotoViewer$$ExternalSyntheticLambda65) this.f$4;
                if (stickerMakerView.sourceBitmap != null && !stickerMakerView.segmentingLoaded) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / stickerMakerView.sourceBitmap.getWidth(), 1.0f / stickerMakerView.sourceBitmap.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i2);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i2 / 90) % 2 != 0) {
                        matrix.postScale(stickerMakerView.sourceBitmap.getHeight(), stickerMakerView.sourceBitmap.getWidth());
                    } else {
                        matrix.postScale(stickerMakerView.sourceBitmap.getWidth(), stickerMakerView.sourceBitmap.getHeight());
                    }
                    if (!list.isEmpty()) {
                        int i3 = 0;
                        while (i3 < list.size()) {
                            StickerMakerView.SubjectMock subjectMock = (StickerMakerView.SubjectMock) list.get(i3);
                            StickerMakerView.SegmentedObject segmentedObject2 = stickerMakerView.new SegmentedObject();
                            RectF rectF = segmentedObject2.bounds;
                            int i4 = subjectMock.startX;
                            int i5 = subjectMock.startY;
                            rectF.set(i4, i5, i4 + subjectMock.width, i5 + subjectMock.height);
                            segmentedObject2.rotatedBounds.set(segmentedObject2.bounds);
                            matrix.mapRect(segmentedObject2.rotatedBounds);
                            segmentedObject2.orientation = i2;
                            Bitmap bitmapCreateSmoothEdgesSegmentedImage = stickerMakerView.createSmoothEdgesSegmentedImage(subjectMock.bitmap, subjectMock.startX, subjectMock.startY, false);
                            segmentedObject2.image = bitmapCreateSmoothEdgesSegmentedImage;
                            if (bitmapCreateSmoothEdgesSegmentedImage != null) {
                                segmentedObject2.darkMaskImage = segmentedObject2.makeDarkMaskImage();
                                StickerMakerView.createSegmentImagePath(segmentedObject2, stickerMakerView.containerWidth, stickerMakerView.containerHeight);
                                stickerMakerView.segmentBorderImageWidth = segmentedObject2.borderImageWidth;
                                stickerMakerView.segmentBorderImageHeight = segmentedObject2.borderImageHeight;
                                arrayList.add(segmentedObject2);
                            }
                            i3++;
                            segmentedObject = null;
                        }
                        stickerMakerView.selectedObject = segmentedObject;
                        stickerMakerView.segmentingLoaded = true;
                        stickerMakerView.segmentingLoading = false;
                        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(25, stickerMakerView, arrayList));
                    } else {
                        StickerMakerView.SegmentedObject segmentedObject3 = stickerMakerView.new SegmentedObject();
                        segmentedObject3.bounds.set(0.0f, 0.0f, stickerMakerView.sourceBitmap.getWidth(), stickerMakerView.sourceBitmap.getHeight());
                        segmentedObject3.rotatedBounds.set(segmentedObject3.bounds);
                        matrix.mapRect(segmentedObject3.rotatedBounds);
                        segmentedObject3.orientation = i2;
                        Bitmap bitmapCreateSmoothEdgesSegmentedImage2 = stickerMakerView.createSmoothEdgesSegmentedImage(stickerMakerView.sourceBitmap, 0, 0, false);
                        segmentedObject3.image = bitmapCreateSmoothEdgesSegmentedImage2;
                        if (bitmapCreateSmoothEdgesSegmentedImage2 != null) {
                            segmentedObject3.darkMaskImage = segmentedObject3.makeDarkMaskImage();
                            StickerMakerView.createSegmentImagePath(segmentedObject3, stickerMakerView.containerWidth, stickerMakerView.containerHeight);
                            stickerMakerView.segmentBorderImageWidth = segmentedObject3.borderImageWidth;
                            stickerMakerView.segmentBorderImageHeight = segmentedObject3.borderImageHeight;
                            arrayList.add(segmentedObject3);
                            AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(16, stickerMakerView, arrayList, photoViewer$$ExternalSyntheticLambda65, segmentedObject3));
                            stickerMakerView.selectedObject = segmentedObject3;
                            stickerMakerView.segmentingLoaded = true;
                            stickerMakerView.segmentingLoading = false;
                        } else {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        }
                    }
                    break;
                }
                break;
            case 16:
                ((SlotsDrawable) this.f$0).lambda$setBaseDice$4((TLRPC.TL_messages_stickerSet) this.f$1, this.f$2, (MessageObject) this.f$3, (ChatMessageCell) this.f$4);
                break;
            case 17:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                BottomSheet bottomSheet = ((BottomSheet[]) this.f$1)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                StarsController.getInstance(this.f$2, false).invalidateSubscriptions();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList((TLObject) this.f$3), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, (String) this.f$4))).show(false);
                }
                break;
            case 18:
                long[] jArr = (long[]) this.f$0;
                long j2 = jArr[0];
                int i6 = this.f$2;
                BackupImageView backupImageView = (BackupImageView) this.f$1;
                if (j2 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i6).getUser(Long.valueOf(jArr[0]));
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setInfo(user);
                    backupImageView.setForUserOrChat(user, avatarDrawable);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i6).getChat(Long.valueOf(-jArr[0]));
                    AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                    avatarDrawable2.setInfo(chat);
                    backupImageView.setForUserOrChat(chat, avatarDrawable2);
                }
                long j3 = jArr[0];
                BackupImageView backupImageView2 = (BackupImageView) this.f$3;
                TextView textView = (TextView) this.f$4;
                if (j3 < 0) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i6).getChat(Long.valueOf(-jArr[0]));
                    if (backupImageView2 != null) {
                        AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                        avatarDrawable3.setInfo(chat2);
                        backupImageView2.setForUserOrChat(chat2, avatarDrawable3);
                    }
                    if (textView != null) {
                        textView.setText(chat2 == null ? "" : chat2.title);
                    }
                } else {
                    TLRPC.User user2 = MessagesController.getInstance(i6).getUser(Long.valueOf(jArr[0]));
                    if (backupImageView2 != null) {
                        AvatarDrawable avatarDrawable4 = new AvatarDrawable();
                        avatarDrawable4.setInfo(user2);
                        backupImageView2.setForUserOrChat(user2, avatarDrawable4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                    }
                }
                break;
            case 19:
                boolean z4 = ((TLObject) this.f$0) instanceof TLRPC.TL_boolTrue;
                boolean[] zArr = (boolean[]) this.f$1;
                Utilities.Callback callback = (Utilities.Callback) this.f$4;
                if (z4) {
                    int i7 = this.f$2;
                    TLRPC.User currentUser = UserConfig.getInstance(i7).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = ((TL_account.updateEmojiStatus) this.f$3).emoji_status;
                        NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i7).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run(null);
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback.run("SERVER_ERROR");
                }
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$18((TLObject) this.f$1, this.f$2, (BotWebViewContainer.MyWebView) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda15(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public GiftSheet$$ExternalSyntheticLambda15(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public GiftSheet$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = i;
        this.f$4 = obj4;
    }

    public GiftSheet$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$2 = i;
    }

    public GiftSheet$$ExternalSyntheticLambda15(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i, TL_account.updateEmojiStatus updateemojistatus) {
        this.$r8$classId = 19;
        this.f$0 = tLObject;
        this.f$1 = zArr;
        this.f$4 = callback;
        this.f$2 = i;
        this.f$3 = updateemojistatus;
    }
}
