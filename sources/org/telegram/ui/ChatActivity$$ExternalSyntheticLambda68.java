package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.PagerSlidingTabStrip;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.RichEditor;

public final class ChatActivity$$ExternalSyntheticLambda68 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChatActivity$$ExternalSyntheticLambda68(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        int i;
        StoriesController.StoryAlbum storyAlbumFindById;
        Utilities.Callback callback;
        int i2 = 2;
        int i3 = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) obj).jumpToDate(i3);
                break;
            case 1:
                AdminLogFilterAlert2 adminLogFilterAlert2 = (AdminLogFilterAlert2) obj;
                if (i3 == 0) {
                    adminLogFilterAlert2.sectionMembersExpanded = !adminLogFilterAlert2.sectionMembersExpanded;
                } else if (i3 == 1) {
                    adminLogFilterAlert2.sectionSettingsExpanded = !adminLogFilterAlert2.sectionSettingsExpanded;
                } else if (i3 == 2) {
                    adminLogFilterAlert2.sectionMessagesExpanded = !adminLogFilterAlert2.sectionMessagesExpanded;
                }
                adminLogFilterAlert2.adapter.update(true);
                adminLogFilterAlert2.applyScrolledPosition$1();
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z = !zArr[i3];
                zArr[i3] = z;
                ((CheckBoxCell) view).setChecked(z, true);
                break;
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                chatAttachAlertPhotoLayout.parentAlert.actionBar.getActionBarMenuOnItemClick().onItemClick(i3);
                chatAttachAlertPhotoLayout.dropDownContainer.toggleSubMenu(null, null);
                break;
            case 4:
                ((GroupCallActivity.AnonymousClass6.AnonymousClass1) obj).viewPager.setCurrentItem(i3, true);
                break;
            case 5:
                GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass1 = ((GroupCallRecordAlert.Adapter) obj).this$0;
                anonymousClass1.onStartRecord(i3);
                anonymousClass1.lambda$showGiftOfferSheet$15();
                break;
            case 6:
                PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) obj;
                if (pagerSlidingTabStrip.pager.getAdapter() instanceof PagerSlidingTabStrip.IconTabProvider) {
                    EmojiView.EmojiPagesAdapter emojiPagesAdapter = (EmojiView.EmojiPagesAdapter) ((PagerSlidingTabStrip.IconTabProvider) pagerSlidingTabStrip.pager.getAdapter());
                    emojiPagesAdapter.getClass();
                    EmojiView emojiView = EmojiView.this;
                    if ((i3 == 1 || i3 == 2) && emojiView.stickersBanned) {
                        emojiView.showStickerBanHint(true, false, i3 == 1);
                    } else if (i3 == 0 && emojiView.emojiBanned) {
                        emojiView.showStickerBanHint(true, true, false);
                    }
                }
                pagerSlidingTabStrip.pager.setCurrentItem(i3, false);
                break;
            case 7:
                AlertsCreator.AnonymousClass57 anonymousClass57 = (AlertsCreator.AnonymousClass57) obj;
                EditTextBoldCursor editTextBoldCursor = anonymousClass57.editText;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                anonymousClass57.val$report.run(Integer.valueOf(i3), editTextBoldCursor.getText().toString());
                anonymousClass57.lambda$showGiftOfferSheet$15();
                break;
            case 8:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.scrollTo(view, i3, scrollSlidingTextTabStrip.tabsContainer.indexOfChild(view));
                break;
            case 9:
                UpdateLayout updateLayout = (UpdateLayout) obj;
                int i4 = updateLayout.updateLayoutIcon.mediaActionDrawable.nextIcon;
                if (i4 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    updateLayout.updateAppUpdateViews(i3, true);
                } else if (i4 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    updateLayout.updateAppUpdateViews(i3, true);
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", updateLayout.activity, null, false);
                    }
                }
                break;
            case 10:
                View.OnClickListener onClickListener = ((ChatActivityChannelButtonsLayout) obj).onClickListeners[i3];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 11:
                ButtonOnClickListener buttonOnClickListener = ((ChatActivitySideControlsButtonsLayout) obj).onClickListener;
                if (buttonOnClickListener != null) {
                    buttonOnClickListener.onClick(i3);
                }
                break;
            case 12:
                ((GroupCallActivity.AnonymousClass47) obj).viewPager.setCurrentItem(i3, true);
                break;
            case 13:
                VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) obj;
                if (anonymousClass24.scrollAnimator == null && view.getAlpha() != 0.0f) {
                    anonymousClass24.setCurrentPage(i3, true);
                    break;
                }
                break;
            case 14:
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout) obj).getSwipeBack().openForeground(i3);
                break;
            case 15:
                KeepMediaPopupView keepMediaPopupView = (KeepMediaPopupView) obj;
                keepMediaPopupView.window.dismiss();
                int i5 = keepMediaPopupView.currentType;
                if (i5 >= 0) {
                    keepMediaPopupView.cacheByChatsController.setKeepMedia(i5, i3);
                    KeepMediaPopupView.Callback callback2 = keepMediaPopupView.callback;
                    if (callback2 != null) {
                        callback2.onKeepMediaChange(i3);
                    }
                } else {
                    KeepMediaPopupView.Callback callback3 = keepMediaPopupView.callback;
                    if (callback3 != null) {
                        callback3.onKeepMediaChange(i3);
                    }
                }
                break;
            case 16:
                MainTabsActivity mainTabsActivity = (MainTabsActivity) obj;
                ValueAnimator valueAnimator = mainTabsActivity.viewPager.manualScrolling;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = mainTabsActivity.viewPager;
                    if (!viewPagerActivityPagerLayout.startedTracking) {
                        if (viewPagerActivityPagerLayout.getCurrentPosition() == i3) {
                            Object currentVisibleFragment = mainTabsActivity.getCurrentVisibleFragment();
                            if (currentVisibleFragment instanceof MainTabsActivity.TabFragmentDelegate) {
                                ((MainTabsActivity.TabFragmentDelegate) currentVisibleFragment).onParentScrollToTop();
                            }
                        } else {
                            mainTabsActivity.selectTab(i3, true);
                            mainTabsActivity.viewPager.scrollToPosition$1(i3);
                        }
                        break;
                    }
                }
                break;
            case 17:
                PassportActivity passportActivity = (PassportActivity) obj;
                passportActivity.uploadingFileType = i3;
                if (i3 == 1) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.selfieLayout;
                } else if (i3 == 4) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.translationLayout;
                } else if (i3 == 2) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.frontLayout;
                } else if (i3 == 3) {
                    passportActivity.currentPhotoViewerLayout = passportActivity.reverseLayout;
                } else {
                    passportActivity.currentPhotoViewerLayout = passportActivity.documentsLayout;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.getInstance().setParentActivity(null, passportActivity, null);
                PassportActivity.AnonymousClass1 anonymousClass2 = passportActivity.provider;
                if (i3 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(passportActivity.selfieDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, anonymousClass2);
                } else if (i3 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(passportActivity.frontDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList2, 0, anonymousClass2);
                } else if (i3 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(passportActivity.reverseDocument);
                    PhotoViewer.getInstance().openPhoto(arrayList3, 0, anonymousClass2);
                } else if (i3 == 0) {
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    ArrayList arrayList4 = passportActivity.documents;
                    photoViewer.openPhoto(arrayList4, arrayList4.indexOf(secureDocument), anonymousClass2);
                } else {
                    PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                    ArrayList arrayList5 = passportActivity.translationDocuments;
                    photoViewer2.openPhoto(arrayList5, arrayList5.indexOf(secureDocument), anonymousClass2);
                }
                break;
            case 18:
                PhotoAlbumPickerActivity photoAlbumPickerActivity = (PhotoAlbumPickerActivity) obj;
                ActionBarPopupWindow actionBarPopupWindow = photoAlbumPickerActivity.sendPopupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    photoAlbumPickerActivity.sendPopupWindow.dismiss(true);
                }
                if (i3 == 0) {
                    AlertsCreator.createScheduleDatePickerDialog(photoAlbumPickerActivity.getParentActivity(), photoAlbumPickerActivity.chatActivity.getDialogId(), new PhotoAlbumPickerActivity$$ExternalSyntheticLambda2(photoAlbumPickerActivity, i2));
                } else {
                    photoAlbumPickerActivity.sendSelectedPhotos(photoAlbumPickerActivity.selectedPhotosOrder, photoAlbumPickerActivity.selectedPhotos);
                    photoAlbumPickerActivity.finishFragment();
                }
                break;
            case 19:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) obj;
                ActionBarPopupWindow actionBarPopupWindow2 = photoPickerActivity.sendPopupWindow;
                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                    photoPickerActivity.sendPopupWindow.dismiss(true);
                }
                if (i3 == 0) {
                    AlertsCreator.createScheduleDatePickerDialog(photoPickerActivity.getParentActivity(), photoPickerActivity.chatActivity.getDialogId(), new PhotoPickerActivity$$ExternalSyntheticLambda1(photoPickerActivity, i2));
                } else {
                    photoPickerActivity.sendSelectedPhotos(0, true);
                }
                break;
            case 20:
                int i6 = PopupNotificationActivity.$r8$clinit;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    MessageObject messageObject = (MessageObject) obj;
                    SendMessagesHelper.getInstance(i3).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                }
                break;
            case 21:
                final ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i3 == 0) {
                    ProfileActivity.AnonymousClass9 anonymousClass9 = profileActivity.sharedMediaLayout;
                    if (!anonymousClass9.isActionModeShowed) {
                        if (SharedMediaLayout.isStoryAlbumPageType(anonymousClass9.getClosestTab())) {
                            ProfileActivity.AnonymousClass9 anonymousClass10 = profileActivity.sharedMediaLayout;
                            profileActivity.sharedMediaLayout.openAddStoriesToAlbumSheet(profileActivity, profileActivity.getDialogId(), anonymousClass10.storyAlbums_getAlbumIdByTabType(anonymousClass10.getClosestTab()));
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            StoryRecorder storyRecorder = StoryRecorder.getInstance(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            storyRecorder.closingSourceProvider = new StoryRecorder.ClosingViewProvider() {
                                @Override
                                public final StoryRecorder.SourceView getView(long j) {
                                    ProfileActivity profileActivity2 = ProfileActivity.this;
                                    if (j != profileActivity2.getDialogId()) {
                                        return null;
                                    }
                                    profileActivity2.avatarImage.setRoundRadiusForExpand((int) AndroidUtilities.lerp(profileActivity2.getSmallAvatarRoundRadius(), 0.0f, profileActivity2.currentExpandAnimatorValue));
                                    AnonymousClass21 anonymousClass21 = profileActivity2.avatarImage;
                                    boolean zIsForum = ChatObject.isForum(profileActivity2.currentChat);
                                    if (anonymousClass21 == null || anonymousClass21.getRootView() == null) {
                                        return null;
                                    }
                                    float scaleX = ((View) anonymousClass21.getParent()).getScaleX();
                                    float imageWidth = anonymousClass21.getImageReceiver().getImageWidth() * scaleX;
                                    float f = zIsForum ? 0.32f * imageWidth : imageWidth;
                                    StoryRecorder.SourceView.AnonymousClass1 anonymousClass3 = new StoryRecorder.SourceView.AnonymousClass1(anonymousClass21, 0);
                                    int[] iArr = new int[2];
                                    float[] fArr = new float[2];
                                    anonymousClass21.getRootView().getLocationOnScreen(iArr);
                                    AndroidUtilities.getViewPositionInParent(anonymousClass21, (ViewGroup) anonymousClass21.getRootView(), fArr);
                                    float imageX = (anonymousClass21.getImageReceiver().getImageX() * scaleX) + iArr[0] + fArr[0];
                                    float imageY = (anonymousClass21.getImageReceiver().getImageY() * scaleX) + iArr[1] + fArr[1];
                                    anonymousClass3.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                                    anonymousClass3.backgroundImageReceiver = anonymousClass21.getImageReceiver();
                                    anonymousClass3.rounding = f;
                                    return anonymousClass3;
                                }

                                @Override
                                public final void preLayout(long j, LinkManager$3$$ExternalSyntheticLambda0 linkManager$3$$ExternalSyntheticLambda0) {
                                    ProfileActivity profileActivity2 = ProfileActivity.this;
                                    profileActivity2.avatarImage.setHasStories(profileActivity2.needInsetForStories());
                                    if (j == profileActivity2.getDialogId() && profileActivity2.allowPullingDown && profileActivity2.currentExpandAnimatorValue > 0.0f) {
                                        AnonymousClass14 anonymousClass14 = profileActivity2.layoutManager;
                                        anonymousClass14.scrollToPositionWithOffset(0, (profileActivity2.getActionsExtraHeight() + profileActivity2.getHeaderOnlyExtraHeight()) - profileActivity2.listView.getPaddingTop(), anonymousClass14.mShouldReverseLayout);
                                        profileActivity2.listView.post(new LinkManager$$ExternalSyntheticLambda4(profileActivity2, 11));
                                    }
                                    AndroidUtilities.runOnUIThread(linkManager$3$$ExternalSyntheticLambda0, 30L);
                                }
                            };
                            storyRecorder.open(null);
                        } else {
                            profileActivity.showDialog(new PremiumFeatureBottomSheet(profileActivity, profileActivity.getParentActivity(), profileActivity.getCurrentAccount(), false, 14, true, null));
                        }
                    }
                }
                if (!SharedMediaLayout.isStoryAlbumPageType(profileActivity.sharedMediaLayout.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    ProfileActivity$$ExternalSyntheticLambda72 profileActivity$$ExternalSyntheticLambda72 = profileActivity.applyBulletin;
                    if (profileActivity$$ExternalSyntheticLambda72 != null) {
                        profileActivity$$ExternalSyntheticLambda72.run();
                        profileActivity.applyBulletin = null;
                    }
                    Bulletin bulletin = Bulletin.visibleBulletin;
                    if (bulletin != null) {
                        bulletin.hide();
                    }
                    boolean z2 = profileActivity.sharedMediaLayout.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.sharedMediaLayout.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i = 0;
                        for (int i7 = 0; i7 < actionModeSelected.size(); i7++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i7).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    profileActivity.sharedMediaLayout.closeActionMode(false);
                    if (z2) {
                        profileActivity.sharedMediaLayout.scrollToPage(8);
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList6.size()];
                        for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i8);
                            zArr2[i8] = storyItem2.pinned;
                            storyItem2.pinned = z2;
                        }
                        profileActivity.getMessagesController().getStoriesController().updateStoriesInLists(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z3 = z2;
                        profileActivity.applyBulletin = new ProfileActivity$$ExternalSyntheticLambda72(profileActivity, clientUserId, arrayList6, z2, 0);
                        PhotoViewer$$ExternalSyntheticLambda177 photoViewer$$ExternalSyntheticLambda177 = new PhotoViewer$$ExternalSyntheticLambda177(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 8);
                        (z3 ? BulletinFactory.of(profileActivity).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), photoViewer$$ExternalSyntheticLambda177).show() : BulletinFactory.of(profileActivity).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, photoViewer$$ExternalSyntheticLambda177).show()).onHideListener = new QrActivity$$ExternalSyntheticLambda17(i2, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long dialogId = profileActivity.getDialogId();
                    ProfileActivity.AnonymousClass9 anonymousClass11 = profileActivity.sharedMediaLayout;
                    int iStoryAlbums_getAlbumIdByTabType = anonymousClass11.storyAlbums_getAlbumIdByTabType(anonymousClass11.getClosestTab());
                    StoriesController.StoriesCollections storyAlbumsList = profileActivity.getMessagesController().getStoriesController().getStoryAlbumsList(dialogId, false);
                    String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(iStoryAlbums_getAlbumIdByTabType)) == null) ? null : storyAlbumFindById.title;
                    ProfileActivity$$ExternalSyntheticLambda72 profileActivity$$ExternalSyntheticLambda73 = profileActivity.applyBulletin;
                    if (profileActivity$$ExternalSyntheticLambda73 != null) {
                        profileActivity$$ExternalSyntheticLambda73.run();
                        profileActivity.applyBulletin = null;
                    }
                    Bulletin bulletin2 = Bulletin.visibleBulletin;
                    if (bulletin2 != null) {
                        bulletin2.hide();
                    }
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.sharedMediaLayout.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i9 = 0; i9 < actionModeSelected2.size(); i9++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i9).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.sharedMediaLayout.closeActionMode(false);
                    if (!arrayList7.isEmpty()) {
                        ArticleViewer$$ExternalSyntheticLambda48 articleViewer$$ExternalSyntheticLambda48 = new ArticleViewer$$ExternalSyntheticLambda48(profileActivity, dialogId, iStoryAlbums_getAlbumIdByTabType, arrayList7, 13);
                        profileActivity.getMessagesController().getStoriesController().removeStoriesFromAlbum(iStoryAlbums_getAlbumIdByTabType, dialogId, arrayList7);
                        BulletinFactory.of(profileActivity).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), str)), articleViewer$$ExternalSyntheticLambda48, LocaleController.getString(R.string.UndoNoCaps)).show();
                        break;
                    }
                }
                break;
            case 22:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj;
                starGiftPreviewSheet.getClass();
                int i10 = StarGiftPreviewSheet.TabsSelectorView.$r8$clinit;
                StarGiftPreviewSheet.TabsSelectorView tabsSelectorView = starGiftPreviewSheet.tabsSelectorView;
                int i11 = tabsSelectorView.selectedTab;
                if (i11 != i3) {
                    GlassTabView[] glassTabViewArr = tabsSelectorView.tabs;
                    glassTabViewArr[i11].setSelected(false, true);
                    glassTabViewArr[i3].setSelected(true, true);
                    tabsSelectorView.selectedTab = i3;
                    tabsSelectorView.animator.animateTo(i3);
                    tabsSelectorView.onTabSelectListener.run(Integer.valueOf(i3));
                }
                break;
            case 23:
                StarGiftPreviewSheet.TabsSelectorView tabsSelectorView2 = (StarGiftPreviewSheet.TabsSelectorView) obj;
                int i12 = tabsSelectorView2.selectedTab;
                if (i12 != i3) {
                    GlassTabView[] glassTabViewArr2 = tabsSelectorView2.tabs;
                    glassTabViewArr2[i12].setSelected(false, true);
                    glassTabViewArr2[i3].setSelected(true, true);
                    tabsSelectorView2.selectedTab = i3;
                    tabsSelectorView2.animator.animateTo(i3);
                    tabsSelectorView2.onTabSelectListener.run(Integer.valueOf(i3));
                }
                break;
            case 24:
                StatisticActivity statisticActivity = (StatisticActivity) obj;
                statisticActivity.viewPagerFixed.scrollToPosition$1(i3);
                statisticActivity.selectTab(i3, true);
                break;
            case 25:
                StoryRecorder.AnonymousClass11 anonymousClass12 = (StoryRecorder.AnonymousClass11) obj;
                if (!anonymousClass12.selectedStories.contains(Integer.valueOf(i3))) {
                    anonymousClass12.selectedStories.add(Integer.valueOf(i3));
                } else if (anonymousClass12.selectedStories.size() > 1) {
                    anonymousClass12.selectedStories.remove(Integer.valueOf(i3));
                }
                AndroidUtilities.forEachViews((RecyclerView) anonymousClass12.listView, (Consumer) new QrActivity$5$$ExternalSyntheticLambda0(anonymousClass12, 11));
                break;
            case 26:
                PreviewButtons previewButtons = PreviewButtons.this;
                if (previewButtons.appearing && (callback = previewButtons.onClickListener) != null) {
                    callback.run(Integer.valueOf(i3));
                    break;
                }
                break;
            default:
                ((RichEditor) obj).listView.onFormattingClicked(i3);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda68(MessageObject messageObject, int i) {
        this.$r8$classId = 20;
        this.f$1 = i;
        this.f$0 = messageObject;
    }
}
