package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda65;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class OAuthSheet$$ExternalSyntheticLambda13 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public OAuthSheet$$ExternalSyntheticLambda13(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Document document;
        Runnable runnable;
        int i = 22;
        int i2 = 3;
        int iSendRequest = 0;
        int i3 = 1;
        Object obj2 = this.f$0;
        Object obj3 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) obj2;
                        if (i4 < arrayList.size()) {
                            String str = (String) arrayList.get(i4);
                            int i5 = 0;
                            while (true) {
                                if (i5 < tL_messages_stickerSet.packs.size()) {
                                    if (tL_messages_stickerSet.packs.get(i5).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i5).emoticon, str)) {
                                        i5++;
                                    } else {
                                        long jLongValue = tL_messages_stickerSet.packs.get(i5).documents.get(0).longValue();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < tL_messages_stickerSet.documents.size()) {
                                                if (tL_messages_stickerSet.documents.get(i6).id == jLongValue) {
                                                    document = tL_messages_stickerSet.documents.get(i6);
                                                } else {
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                                document = null;
                            }
                            if (document != null) {
                                ((BackupImageView[]) obj3)[i4].setImage(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str), null);
                            }
                            i4++;
                        }
                        break;
                    }
                }
                break;
            case 1:
                BaseFragment baseFragment = (BaseFragment) obj;
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                if (folderBottomSheet.updates != null || (folderBottomSheet.invite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(baseFragment).createSimpleBulletin(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, folderBottomSheet.escapedTitle)), arrayList2.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", folderBottomSheet.alreadyJoined.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList2.size(), new Object[0]), R.raw.folder_in);
                    bulletinCreateSimpleBulletin.duration = 5000;
                    bulletinCreateSimpleBulletin.show();
                } else {
                    Bulletin bulletinCreateSimpleBulletin2 = BulletinFactory.of(baseFragment).createSimpleBulletin(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, folderBottomSheet.escapedTitle)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList2.size(), new Object[0]), R.raw.contact_check);
                    bulletinCreateSimpleBulletin2.duration = 5000;
                    bulletinCreateSimpleBulletin2.show();
                }
                break;
            case 2:
                Bitmap bitmapCreateBitmap = (Bitmap) obj;
                View view = (View) obj2;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int iClamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmapCreateBitmap.getWidth()), bitmapCreateBitmap.getWidth(), 0);
                    int iClamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmapCreateBitmap.getHeight()), bitmapCreateBitmap.getHeight(), 0);
                    int iClamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmapCreateBitmap.getWidth()), bitmapCreateBitmap.getWidth() - iClamp, 0);
                    int iClamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmapCreateBitmap.getHeight()), bitmapCreateBitmap.getHeight() - iClamp2, 0);
                    if ((iClamp != 0 || iClamp2 != 0 || iClamp3 != bitmapCreateBitmap.getWidth() || iClamp4 != bitmapCreateBitmap.getHeight()) && iClamp3 > 0 && iClamp4 > 0) {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, iClamp, iClamp2, iClamp3, iClamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.04f : -0.07f);
                Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmapCreateBitmap, colorMatrix);
                bitmapApplyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(Theme.currentTheme.isDark() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.currentTheme.isDark() ? -0.2f : -0.07f);
                Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmapCreateBitmap, colorMatrix2);
                bitmapApplyColorMatrix2.setHasAlpha(false);
                bitmapCreateBitmap.recycle();
                ((GiftSheet$$ExternalSyntheticLambda8) obj3).run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
                break;
            case 3:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (((Boolean) obj).booleanValue()) {
                    ((MessagesController) obj2).setContentSettings(true);
                    if (safeLastFragment != null) {
                        BulletinFactory.of(safeLastFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new MessageSendPreview$15$$ExternalSyntheticLambda0(i2, safeLastFragment)), true)).show(true);
                    }
                    ((SharedMediaLayout$$ExternalSyntheticLambda65) obj3).run(Boolean.TRUE);
                } else if (safeLastFragment != null) {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).show();
                }
                break;
            case 4:
                ((SharedMediaLayout) obj2).lambda$onItemLongClick$52((TL_stories.StoryItem) obj3, (StoriesController.StoryAlbum) obj);
                break;
            case 5:
                Long l = (Long) obj;
                ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) obj2;
                contentPreviewViewer.getClass();
                Bundle bundle = new Bundle();
                if (l.longValue() >= 0) {
                    bundle.putLong("user_id", l.longValue());
                } else {
                    bundle.putLong("chat_id", -l.longValue());
                }
                ((BaseFragment) obj3).presentFragment(new ProfileActivity(bundle, null));
                contentPreviewViewer.dismissPopupWindow();
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                ContentPreviewViewer.AnonymousClass1 anonymousClass1 = (ContentPreviewViewer.AnonymousClass1) obj2;
                anonymousClass1.getClass();
                ((Utilities.Callback) obj3).run(bool);
                if (bool.booleanValue()) {
                    ContentPreviewViewer.this.dismissPopupWindow();
                }
                break;
            case 7:
                DialogsActivity dialogsActivity = (DialogsActivity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    Activity activity = (Activity) obj3;
                    dialogsActivity.showDialog(new NotificationPermissionDialog(activity, !PermissionRequest.canAskPermission(), new DialogsActivity$$ExternalSyntheticLambda39(activity, 1)));
                }
                break;
            case 8:
                Integer num = (Integer) obj;
                FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
                if (filterCreateActivity.getUserConfig().isPremium()) {
                    int iIntValue = num.intValue();
                    filterCreateActivity.newFilterColor = iIntValue;
                    ((PeerColorActivity.PeerColorGrid) obj3).setSelected(iIntValue, true);
                    FilterCreateActivity.HeaderCellColorPreview headerCellColorPreview = filterCreateActivity.folderTagsHeader;
                    if (headerCellColorPreview != null) {
                        headerCellColorPreview.setPreviewColor(!filterCreateActivity.getUserConfig().isPremium() ? -1 : filterCreateActivity.newFilterColor, true);
                    }
                    filterCreateActivity.checkDoneButton(true);
                } else {
                    filterCreateActivity.showDialog(new PremiumFeatureBottomSheet((BaseFragment) filterCreateActivity, 35, true));
                }
                break;
            case 9:
                Boolean bool2 = (Boolean) obj;
                GiftSheet giftSheet = (GiftSheet) obj2;
                giftSheet.getClass();
                Utilities.Callback callback = (Utilities.Callback) obj3;
                if (callback != null) {
                    callback.run(bool2);
                }
                if (bool2.booleanValue()) {
                    giftSheet.skipDismissAnimation();
                }
                giftSheet.lambda$showGiftOfferSheet$15();
                break;
            case 10:
                if (((Object[]) obj)[1] == ((StarsController.GiftsList) obj2)) {
                    ((PhotoViewer$$ExternalSyntheticLambda177) obj3).run();
                }
                break;
            case 11:
                String str2 = (String) obj;
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                int i7 = tL_starGiftCollection.collection_id;
                StarsController.GiftsCollections giftsCollections = anonymousClass13.collections;
                giftsCollections.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i8 = giftsCollections.currentAccount;
                updatestargiftcollection.peer = MessagesController.getInstance(i8).getInputPeer(giftsCollections.dialogId);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str2;
                ConnectionsManager.getInstance(i8).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str2;
                anonymousClass13.fillTabs(true);
                break;
            case 12:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) obj2;
                Runnable runnable2 = sendGiftSheet.closeParentSheet;
                if (runnable2 != null) {
                    runnable2.run();
                }
                sendGiftSheet.lambda$showGiftOfferSheet$15();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda78(i3, (TLRPC.User) obj3), 250L);
                SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(sendGiftSheet.currentAccount);
                StringBuilder sb = new StringBuilder("show_gift_for_");
                long j = sendGiftSheet.dialogId;
                sb.append(j);
                editorM.putBoolean(sb.toString(), true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j, true).apply();
                break;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog = (GroupCallActivity$CallEncryptionCell$EncryptionCallDialog) obj2;
                QrActivity.AnonymousClass2 anonymousClass2 = (QrActivity.AnonymousClass2) obj3;
                if (anonymousClass2 != null) {
                    groupCallActivity$CallEncryptionCell$EncryptionCallDialog.getClass();
                    anonymousClass2.setVisibility(0);
                }
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmap = bitmap;
                Paint paint = new Paint(1);
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapPaint = paint;
                Bitmap bitmap2 = groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
                groupCallActivity$CallEncryptionCell$EncryptionCallDialog.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 14:
                final TLRPC.User user = (TLRPC.User) obj;
                LinkManager linkManager = (LinkManager) obj2;
                linkManager.done();
                if (user != null) {
                    final TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                    final long j2 = userArr[0].id;
                    final Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    linkManager.presentFragment(new ChatActivity(bundle2) {
                        public boolean shownToast;

                        @Override
                        public final void onBecomeFullyVisible() {
                            int i9 = 0;
                            super.onBecomeFullyVisible();
                            if (this.shownToast) {
                                return;
                            }
                            this.shownToast = true;
                            BulletinFactory.of(this).createSimpleBulletin(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(user)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(userArr[0])), new LinkManager$3$$ExternalSyntheticLambda0(this, j2, i9)), R.raw.contact_check).show();
                        }
                    }, false);
                    break;
                }
                break;
            case 15:
                List<TLRPC.User> list = (List) obj;
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = (MultiContactsSelectorBottomSheet) obj2;
                multiContactsSelectorBottomSheet.getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = multiContactsSelectorBottomSheet.foundUsers;
                arrayList3.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && multiContactsSelectorBottomSheet.filter(user2)) {
                            arrayList3.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool3 = multiContactsSelectorBottomSheet.filterBots;
                if (bool3 == null || !bool3.booleanValue()) {
                    multiContactsSelectorBottomSheet.updateList$2(true, true);
                } else {
                    OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(16, multiContactsSelectorBottomSheet, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    String str3 = (String) obj3;
                    if (str3 == null || str3.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(oAuthSheet$$ExternalSyntheticLambda13, i));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str3;
                        tL_contacts_search.limit = 50;
                        iSendRequest = connectionsManager.sendRequest(tL_contacts_search, new LinkManager$$ExternalSyntheticLambda8(6, messagesController, oAuthSheet$$ExternalSyntheticLambda13));
                    }
                    multiContactsSelectorBottomSheet.lastRequestId = iSendRequest;
                }
                break;
            case 16:
                List<TLRPC.User> list2 = (List) obj;
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet2 = (MultiContactsSelectorBottomSheet) obj2;
                if (list2 != null) {
                    multiContactsSelectorBottomSheet2.getClass();
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null) {
                            HashSet hashSet2 = (HashSet) obj3;
                            if (!hashSet2.contains(Long.valueOf(user3.id)) && multiContactsSelectorBottomSheet2.filter(user3)) {
                                multiContactsSelectorBottomSheet2.foundUsers.add(user3);
                                hashSet2.add(Long.valueOf(user3.id));
                            }
                        }
                    }
                }
                multiContactsSelectorBottomSheet2.updateList$2(true, true);
                break;
            case 17:
                TLRPC.User user4 = (TLRPC.User) obj;
                NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) obj2;
                if (user4 == null) {
                    newContactBottomSheet.phoneStatusView.setImageDrawable(null);
                    newContactBottomSheet.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new LinkManager$$ExternalSyntheticLambda2(21, newContactBottomSheet, (String) obj3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable drawableMutate = newContactBottomSheet.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(newContactBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
                    newContactBottomSheet.phoneStatusView.setImageDrawable(drawableMutate);
                    if (user4.contact) {
                        newContactBottomSheet.underPhoneTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new LinkManager$$ExternalSyntheticLambda2(i, newContactBottomSheet, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        newContactBottomSheet.underPhoneTextView.setText("This phone number is on Telegram.");
                    }
                }
                newContactBottomSheet.updateBottomTranslation(false);
                break;
            case 18:
                ((String[]) obj2)[0] = (String) obj;
                ((OAuthSheet$$ExternalSyntheticLambda8) obj3).run();
                break;
            case 19:
                PeerColorActivity peerColorActivity = (PeerColorActivity) obj2;
                peerColorActivity.loading = false;
                ((PeerColorActivity.Page) obj3).button.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    peerColorActivity.apply();
                    peerColorActivity.finishFragment();
                    peerColorActivity.showBulletin$1();
                }
                break;
            case 20:
                Long l2 = (Long) obj;
                PollItemMenu pollItemMenu = (PollItemMenu) obj2;
                pollItemMenu.getClass();
                Bundle bundle3 = new Bundle();
                if (l2.longValue() >= 0) {
                    bundle3.putLong("user_id", l2.longValue());
                } else {
                    bundle3.putLong("chat_id", -l2.longValue());
                }
                ((BaseFragment) obj3).presentFragment(new ProfileActivity(bundle3, null));
                pollItemMenu.dismiss(false);
                break;
            case 21:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                profileActivity.getClass();
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new LinkManager$$ExternalSyntheticLambda0(profileActivity, userFull, tL_birthday2, 24), 1024);
                break;
            case 22:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = (ProfileBirthdayEffect.BirthdayEffectFetcher) obj2;
                birthdayEffectFetcher.getClass();
                String str4 = (String) obj3;
                TLRPC.Document documentFindSticker = SelectAnimatedEmojiDialog.findSticker(str4, tL_messages_stickerSet2);
                if (documentFindSticker == null) {
                    StringBuilder sbM4m = SurfaceContainer$$ExternalSyntheticOutline0.m4m("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = ProfileBirthdayEffect.interactions;
                    FileLog.e(sbM4m.toString());
                } else {
                    ProfileBirthdayEffect.ImageReceiverAsset imageReceiverAsset = new ProfileBirthdayEffect.ImageReceiverAsset();
                    birthdayEffectFetcher.interactionAsset = imageReceiverAsset;
                    birthdayEffectFetcher.allAssets.add(imageReceiverAsset);
                    int filterWidth = EmojiAnimationsOverlay.getFilterWidth();
                    birthdayEffectFetcher.interactionAsset.setAutoRepeat(0);
                    ProfileBirthdayEffect.ImageReceiverAsset imageReceiverAsset2 = birthdayEffectFetcher.interactionAsset;
                    String str5 = filterWidth + "_" + filterWidth + "_precache";
                    ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = new ProfileActivity$9$$ExternalSyntheticLambda1(birthdayEffectFetcher, i2);
                    imageReceiverAsset2.getClass();
                    imageReceiverAsset2.setDelegate(new ProfileBirthdayEffect.ImageReceiverAsset.AnonymousClass1(new Runnable[]{profileActivity$9$$ExternalSyntheticLambda1}));
                    imageReceiverAsset2.setImage(ImageLocation.getForDocument(documentFindSticker), str5, null, null, tL_messages_stickerSet2, 0);
                    birthdayEffectFetcher.interactionAsset.onAttachedToWindow();
                    birthdayEffectFetcher.setsLoaded[1] = true;
                    birthdayEffectFetcher.checkWhenLoaded();
                }
                break;
            case 23:
                ((LinkEditActivity$$ExternalSyntheticLambda9) obj2).run((HashSet) obj3);
                break;
            case 24:
                Bitmap bitmap3 = (Bitmap) obj;
                SecretVoicePlayer secretVoicePlayer = (SecretVoicePlayer) obj2;
                View view2 = (View) obj3;
                if (view2 != null) {
                    secretVoicePlayer.getClass();
                    view2.setVisibility(0);
                }
                secretVoicePlayer.blurBitmap = bitmap3;
                Paint paint2 = new Paint(1);
                secretVoicePlayer.blurBitmapPaint = paint2;
                Bitmap bitmap4 = secretVoicePlayer.blurBitmap;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                secretVoicePlayer.blurBitmapShader = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
                secretVoicePlayer.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                secretVoicePlayer.blurMatrix = new Matrix();
                break;
            case 25:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                if (stargiftupgradepreview == null) {
                    starGiftSheet.getClass();
                } else {
                    StarGiftSheet.TopView topView = starGiftSheet.topView;
                    topView.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    starGiftSheet.switchPage(1, false, null);
                    topView.setText(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, (String) obj3), null, null, null, null);
                    AffiliateProgramFragment.FeatureCell[] featureCellArr = starGiftSheet.upgradeFeatureCells;
                    featureCellArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    featureCellArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    featureCellArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    starGiftSheet.checkboxLayout.setVisibility(8);
                    starGiftSheet.checkboxSeparator.setVisibility(8);
                    ButtonWithCounterView buttonWithCounterView = starGiftSheet.button;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false, true);
                    buttonWithCounterView.setSubText(null, false);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda15(starGiftSheet, i2));
                    starGiftSheet.show();
                }
                break;
            case 26:
                ((StarGiftSheet) obj2).lambda$show$115((AlertDialog) obj3, (TL_stars.SavedStarGift) obj);
                break;
            case 27:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj2;
                craftTopView.getClass();
                ((StarGiftSheet.CraftTopView.SelectGiftView) obj3).setGift((TL_stars.StarGift) obj, true);
                craftTopView.updateCounts(true);
                break;
            case 28:
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) obj2;
                Browser.Progress progress = resaleBuyTransferAlert.lastPositiveButtonProgress;
                AmountUtils$Currency amountUtils$Currency = (AmountUtils$Currency) obj3;
                if (progress != null && amountUtils$Currency == resaleBuyTransferAlert.selectedCurrency && (runnable = progress.onEndListener) != null) {
                    runnable.run();
                }
                resaleBuyTransferAlert.loadingForms.remove(amountUtils$Currency);
                if (tL_payments_paymentFormStarGift != null) {
                    resaleBuyTransferAlert.forms.put(amountUtils$Currency, new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift));
                    resaleBuyTransferAlert.onUpdateCurrency(true);
                }
                break;
            default:
                ((Utilities.Callback2) obj2).run((AmountUtils$Amount) obj, new LivePlayer$1$$ExternalSyntheticLambda0((SellGiftEnterPriceSheet[]) obj3, i3));
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda13(FolderBottomSheet folderBottomSheet, ArrayList arrayList) {
        this.$r8$classId = 1;
        this.f$1 = folderBottomSheet;
        this.f$0 = arrayList;
    }
}
