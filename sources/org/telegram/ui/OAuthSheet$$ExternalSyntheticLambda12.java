package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TooltipPopup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda24;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda42;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda79;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.CaptionStory$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichCommand;
import org.telegram.ui.iv.RichTextCell;

public final class OAuthSheet$$ExternalSyntheticLambda12 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public OAuthSheet$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        DialogsActivity dialogsActivity;
        BottomSheet[] bottomSheetArr;
        BottomSheet bottomSheet;
        ActionBarPopupWindow actionBarPopupWindow;
        int i = 2;
        char c = 1;
        char c2 = 1;
        final int i2 = 0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                BottomSheet[] bottomSheetArr2 = (BottomSheet[]) obj3;
                BottomSheet bottomSheet2 = bottomSheetArr2[0];
                if (bottomSheet2 != null) {
                    bottomSheet2.lambda$showGiftOfferSheet$15();
                    bottomSheetArr2[0] = null;
                    ((Utilities.Callback) obj2).run((String) obj);
                }
                break;
            case 1:
                ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) obj3;
                TranslateController translateController = (TranslateController) obj2;
                long j = anonymousClass55.dialogId;
                translateController.setHideTranslateDialog(j, true);
                TLRPC.Chat chat = MessagesController.getInstance(anonymousClass55.currentAccount).getChat(Long.valueOf(-j));
                BulletinFactory.of(anonymousClass55.fragment).createSimpleBulletin(R.raw.msg_translate, AndroidUtilities.replaceTags((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat) : LocaleController.getString(R.string.TranslationBarHiddenForChannel)), new DialogsActivity$$ExternalSyntheticLambda8(i, anonymousClass55, translateController), LocaleController.getString(R.string.UndoNoCaps)).show();
                ((ActionBarPopupWindow) obj).dismiss(true);
                break;
            case 2:
                ContactAddActivity contactAddActivity = (ContactAddActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                AlertsCreator.createSimpleAlert((Context) obj2, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new ContactAddActivity$$ExternalSyntheticLambda13(contactAddActivity, user, i2), contactAddActivity.resourcesProvider).show();
                break;
            case 3:
                ((ActiveAuctionsSheet) obj3).lambda$new$0((Context) obj2, (GiftAuctionController.Auction) obj);
                break;
            case 4:
                ((AuctionBidSheet) obj3).lambda$new$2((boolean[]) obj2, (Theme.ResourcesProvider) obj);
                break;
            case 5:
                ((AuctionJoinSheet) obj3).lambda$new$14((Context) obj2, (Theme.ResourcesProvider) obj);
                break;
            case 6:
                ((AuctionJoinSheet) obj3).lambda$new$5((boolean[]) obj2, (Theme.ResourcesProvider) obj);
                break;
            case 7:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) obj3;
                page.getClass();
                ((ItemOptions) obj2).dismiss();
                ProfileGiftsContainer$Page$$ExternalSyntheticLambda24 profileGiftsContainer$Page$$ExternalSyntheticLambda24 = new ProfileGiftsContainer$Page$$ExternalSyntheticLambda24(page, (TL_stars.SavedStarGift) obj, i2);
                HashMap map = ProfileGiftsContainer.cachedLastEmojis;
                page.parent.openEnterNameAlert(null, profileGiftsContainer$Page$$ExternalSyntheticLambda24);
                break;
            case 8:
                MainTabsActivity mainTabsActivity = (MainTabsActivity) obj3;
                mainTabsActivity.getClass();
                ((ItemOptions) obj2).dismiss();
                int i3 = ((MessagesController.DialogFilter) obj).id;
                if (mainTabsActivity.viewPager.getCurrentPosition() == 0 && (dialogsActivity = mainTabsActivity.dialogsActivity) != null) {
                    dialogsActivity.scrollToFolder(i3);
                } else {
                    if (mainTabsActivity.dialogsActivity == null) {
                        mainTabsActivity.prepareDialogsActivity(null);
                    }
                    mainTabsActivity.pendingFolderId = Integer.valueOf(i3);
                    mainTabsActivity.selectTab(0, true);
                    mainTabsActivity.viewPager.scrollToPosition$1(0);
                }
                break;
            case 9:
                if (!((ButtonWithCounterView) obj2).loading && (bottomSheet = (bottomSheetArr = (BottomSheet[]) obj3)[0]) != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    bottomSheetArr[0] = null;
                    ((Runnable) obj).run();
                }
                break;
            case 10:
                ((ProfileActivity) obj3).lambda$updateProfileData$105((TLRPC.User) obj2, (SimpleTextView) obj);
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((ActionBarPopupWindow) obj2).dismiss();
                LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.type);
                saveGalleryExceptions.remove(((SaveToGallerySettingsHelper.DialogException) obj).dialogId);
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.type, saveGalleryExceptions);
                saveToGallerySettingsActivity.updateRows$28();
                break;
            case 12:
                if (((GiftOfferSheet) obj3).inputAmount.currency == AmountUtils$Currency.STARS) {
                    new StarsIntroActivity.StarsOptionsSheet((Context) obj2, (Theme.ResourcesProvider) obj).show();
                }
                break;
            case 13:
                final BottomSheet bottomSheet3 = (BottomSheet) obj2;
                bottomSheet3.setCanDismissWithSwipe(false);
                final ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj;
                buttonWithCounterView.setLoading(true);
                ((StarsController$$ExternalSyntheticLambda42) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i2) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final BottomSheet bottomSheet4 = bottomSheet3;
                                if (!zBooleanValue) {
                                    final ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                                    final int i4 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i4) {
                                                case 0:
                                                    bottomSheet4.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView2.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet4.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet4.lambda$showGiftOfferSheet$15();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final BottomSheet bottomSheet5 = bottomSheet3;
                                if (!zBooleanValue2) {
                                    final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView;
                                    final int i5 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i5) {
                                                case 0:
                                                    bottomSheet5.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet5.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet5.lambda$showGiftOfferSheet$15();
                                }
                                break;
                        }
                    }
                });
                break;
            case 14:
                final BottomSheet bottomSheet4 = (BottomSheet) obj2;
                bottomSheet4.setCanDismissWithSwipe(false);
                final ButtonWithCounterView buttonWithCounterView2 = (ButtonWithCounterView) obj;
                buttonWithCounterView2.setLoading(true);
                final char c3 = c == true ? 1 : 0;
                ((StarsController$$ExternalSyntheticLambda79) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (c3) {
                            case 0:
                                boolean zBooleanValue = bool.booleanValue();
                                final BottomSheet bottomSheet5 = bottomSheet4;
                                if (!zBooleanValue) {
                                    final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView2;
                                    final int i4 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i4) {
                                                case 0:
                                                    bottomSheet5.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet5.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet5.lambda$showGiftOfferSheet$15();
                                }
                                break;
                            default:
                                boolean zBooleanValue2 = bool.booleanValue();
                                final BottomSheet bottomSheet6 = bottomSheet4;
                                if (!zBooleanValue2) {
                                    final ButtonWithCounterView buttonWithCounterView4 = buttonWithCounterView2;
                                    final int i5 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i5) {
                                                case 0:
                                                    bottomSheet6.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView4.setLoading(false);
                                                    break;
                                                default:
                                                    bottomSheet6.setCanDismissWithSwipe(false);
                                                    buttonWithCounterView4.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                } else {
                                    bottomSheet6.lambda$showGiftOfferSheet$15();
                                }
                                break;
                        }
                    }
                });
                break;
            case 15:
                ((VoIPFragment$$ExternalSyntheticLambda7) obj3).run(Long.valueOf(((long[]) obj2)[0]));
                ((BottomSheet) obj).lambda$showGiftOfferSheet$15();
                break;
            case 16:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj3;
                anonymousClass8.getClass();
                ((ActionBarMenuSubItem) obj2).performHapticFeedback(3);
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                if (bulletinFactoryGlobal != null) {
                    bulletinFactoryGlobal.createSimpleBulletinWithIconSize(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new StickersActivity$$ExternalSyntheticLambda18(22, anonymousClass8, (StoryViewer) obj))).show();
                }
                break;
            case 17:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass8) obj3).this$0;
                anonymousClass1.editPrivacy((StoryPrivacyBottomSheet.StoryPrivacy) obj2, (TL_stories.StoryItem) obj);
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null && (actionBarPopupWindow = anonymousClass9.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
            case 18:
                SelfStoryViewsPage.AnonymousClass4 anonymousClass4 = (SelfStoryViewsPage.AnonymousClass4) obj3;
                anonymousClass4.getClass();
                SendGiftSheet.AnonymousClass8 anonymousClass10 = new SendGiftSheet.AnonymousClass8(anonymousClass4, 9);
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = anonymousClass4.this$0;
                new EmojiPacksAlert(anonymousClass10, anonymousClass2.getContext(), anonymousClass2.resourcesProvider, (ArrayList) obj2).show();
                ((ItemOptions) obj).dismiss();
                break;
            case 19:
                StoryRecorder.AnonymousClass8 anonymousClass11 = (StoryRecorder.AnonymousClass8) obj3;
                ItemOptions itemOptions = anonymousClass11.periodPopup;
                if (itemOptions == null || !itemOptions.isShown()) {
                    CaptionStory$$ExternalSyntheticLambda4 captionStory$$ExternalSyntheticLambda4 = new CaptionStory$$ExternalSyntheticLambda4(anonymousClass11, i2);
                    boolean zIsPremium = UserConfig.getInstance(anonymousClass11.currentAccount).isPremium();
                    CaptionStory$$ExternalSyntheticLambda4 captionStory$$ExternalSyntheticLambda5 = zIsPremium ? null : new CaptionStory$$ExternalSyntheticLambda4(anonymousClass11, c2 == true ? 1 : 0);
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((FrameLayout) obj2, (DarkThemeResourceProvider) obj, anonymousClass11.periodButton);
                    anonymousClass11.periodPopup = itemOptionsMakeOptions;
                    itemOptionsMakeOptions.addText(13, AndroidUtilities.dp(200.0f), LocaleController.getString("StoryPeriodHint"));
                    anonymousClass11.periodPopup.addGap();
                    int i4 = 0;
                    while (true) {
                        int[] iArr = CaptionStory.periods;
                        if (i4 >= 4) {
                            ItemOptions itemOptions2 = anonymousClass11.periodPopup;
                            itemOptions2.dimAlpha = 0;
                            itemOptions2.show();
                        } else {
                            int i5 = iArr[i4];
                            ItemOptions itemOptions3 = anonymousClass11.periodPopup;
                            String string = i5 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i5 / 3600, new Object[0]);
                            int i6 = Theme.key_actionBarDefaultSubmenuItem;
                            itemOptions3.add(0, null, string, i6, i6, new OAuthSheet$$ExternalSyntheticLambda17(captionStory$$ExternalSyntheticLambda4, i5, 28));
                            itemOptions3.putPremiumLock((zIsPremium || i5 == 86400 || i5 == Integer.MAX_VALUE) ? null : new OAuthSheet$$ExternalSyntheticLambda17(captionStory$$ExternalSyntheticLambda5, i5, 29));
                            if (anonymousClass11.periodIndex == i4) {
                                anonymousClass11.periodPopup.putCheck();
                            }
                            i4++;
                        }
                    }
                }
                break;
            case 20:
                GalleryListView galleryListView = GalleryListView.this;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                boolean zContains = galleryListView.selectedPhotos.contains(photoEntry);
                ArrayList arrayList = galleryListView.selectedPhotos;
                if (zContains) {
                    arrayList.remove(photoEntry);
                } else if (arrayList.size() + 1 > galleryListView.maxCount) {
                    int i7 = -galleryListView.shiftDp;
                    galleryListView.shiftDp = i7;
                    AndroidUtilities.shakeViewSpring((GalleryListView.Cell) obj, i7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                } else {
                    arrayList.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(galleryListView.listView);
                galleryListView.updateSelectButtonVisible();
                break;
            case 21:
                final StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj3;
                if (!anonymousClass24.isColorListShown) {
                    Runnable runnable = anonymousClass24.onDoneButtonClickedListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet((Context) obj2, anonymousClass24.resourcesProvider);
                    anonymousClass24.colorPickerBottomSheet = colorPickerBottomSheet;
                    colorPickerBottomSheet.onSetColor(anonymousClass24.colorSwatch.color, 2);
                    final PersistColorPalette persistColorPalette = (PersistColorPalette) obj;
                    colorPickerBottomSheet.pipetteDelegate = new ColorPickerBottomSheet.PipetteDelegate() {
                        public boolean hasPipette;
                        public final PersistColorPalette val$palette;

                        public AnonymousClass12() {
                            persistColorPalette = persistColorPalette;
                        }

                        @Override
                        public final FrameLayout getContainerView() {
                            return anonymousClass24.pipetteContainerLayout;
                        }

                        @Override
                        public final View getSnapshotDrawingView() {
                            return anonymousClass24;
                        }

                        @Override
                        public final boolean isPipetteAvailable() {
                            return false;
                        }

                        @Override
                        public final boolean isPipetteVisible() {
                            return this.hasPipette;
                        }

                        @Override
                        public final void onColorSelected(int i8) {
                            StoryRecorder.AnonymousClass24 anonymousClass25 = anonymousClass24;
                            anonymousClass25.showColorList$1(false);
                            PersistColorPalette persistColorPalette2 = persistColorPalette;
                            persistColorPalette2.selectColor(i8, true);
                            persistColorPalette2.saveColors();
                            anonymousClass25.setNewColor(i8);
                            int currentColorPosition = persistColorPalette2.getCurrentColorPosition();
                            AnonymousClass11 anonymousClass12 = anonymousClass25.colorsListView;
                            anonymousClass12.setSelectedColorIndex(currentColorPosition);
                            anonymousClass12.getAdapter().notifyDataSetChanged();
                        }

                        @Override
                        public final void onDrawImageOverCanvas(Canvas canvas) {
                            AnonymousClass3 anonymousClass3 = anonymousClass24.renderView;
                            Matrix matrix = anonymousClass3.getMatrix();
                            canvas.save();
                            canvas.translate(anonymousClass3.getX(), anonymousClass3.getY());
                            canvas.concat(matrix);
                            anonymousClass3.getWidth();
                            throw null;
                        }

                        @Override
                        public final void onStartColorPipette() {
                            this.hasPipette = true;
                        }

                        @Override
                        public final void onStopColorPipette() {
                            this.hasPipette = false;
                        }
                    };
                    colorPickerBottomSheet.colorListener = new AvatarPreviewer$Layout$$ExternalSyntheticLambda2(5, anonymousClass24, persistColorPalette);
                    colorPickerBottomSheet.show();
                }
                break;
            case 22:
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) obj3;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                communityAddOptionsSheet.apply((Utilities.Callback) obj2, communityAddOptionsSheet.isHidden, (chat2 == null || ChatObject.canAddChatToCommunity(chat2)) ? false : true);
                break;
            default:
                ((TooltipPopup) obj3).hide();
                ((RichTextCell) obj2).selectCommand((RichCommand) obj);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda12(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, Runnable runnable) {
        this.$r8$classId = 9;
        this.f$1 = buttonWithCounterView;
        this.f$0 = bottomSheetArr;
        this.f$2 = runnable;
    }
}
