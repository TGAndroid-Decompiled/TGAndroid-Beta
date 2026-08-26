package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;

public final class SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 implements AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate, FileLoader.FileResolver, AlertsCreator.ScheduleDatePickerDelegate, GenericProvider, MediaDataController.KeywordResultCallback, TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, StoryPrivacyBottomSheet.DoneCallback, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void onDoubleTap$org$telegram$ui$Stories$recorder$StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda9(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$ThemeActivity$$ExternalSyntheticLambda3(View view, float f, float f2) {
    }

    @Override
    public void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.$r8$classId) {
            case 18:
                ((BotStarsActivity) this.f$0).initWithdraw(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f$1);
                break;
            default:
                ((StarGiftSheet) this.f$0).initTONTransfer((TwoStepVerificationActivity) this.f$1, tL_inputCheckPasswordSRP);
                break;
        }
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        PassportActivity passportActivity = (PassportActivity) this.f$0;
        passportActivity.getClass();
        int iIntValue = ((Integer) ((View) this.f$1).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = passportActivity.inputFields[iIntValue];
        if (iIntValue == 5) {
            passportActivity.currentCitizeship = country.shortname;
        } else {
            passportActivity.currentResidence = country.shortname;
        }
        editTextBoldCursor.setText(country.name);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 9:
                PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                pollCreateActivity.delegate.sendPoll((TLRPC.TL_messageMediaToDo) this.f$1);
                pollCreateActivity.finishFragment();
                break;
            default:
                PollCreateActivity pollCreateActivity2 = PollCreateActivity.this;
                pollCreateActivity2.delegate.sendPoll((TLRPC.TL_messageMediaPoll) this.f$1);
                pollCreateActivity2.finishFragment();
                break;
        }
    }

    @Override
    public void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, ButtonWithCounterView$$ExternalSyntheticLambda3 buttonWithCounterView$$ExternalSyntheticLambda3, VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0) {
        switch (this.$r8$classId) {
            case 21:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                MessagesController messagesController = MessagesController.getInstance(peerStoriesView.currentAccount);
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$1;
                tL_stories_editStory.peer = messagesController.getInputPeer(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = storyPrivacy.rules;
                ConnectionsManager.getInstance(peerStoriesView.currentAccount).sendRequest(tL_stories_editStory, new LoginActivity$$ExternalSyntheticLambda42(peerStoriesView, buttonWithCounterView$$ExternalSyntheticLambda3, storyItem, storyPrivacy, 17));
                break;
            default:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                if ((storyItem2 != null && storyItem2.pinned) != z3) {
                    MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().updateStoriesPinned(anonymousClass1.dialogId, anonymousClass1.storyItems, z3, null);
                }
                TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(anonymousClass1.currentAccount).sendRequest(togglegroupcallsettings, new ProfileActivity$$ExternalSyntheticLambda65(27, anonymousClass8, (StoryPrivacyBottomSheet) this.f$1));
                    }
                }
                break;
        }
    }

    @Override
    public File getFile() {
        switch (this.$r8$classId) {
            case 5:
                return FileLoader.getInstance(((PhotoViewer) this.f$0).currentAccount).getPathToAttach((TLObject) this.f$1, true);
            default:
                return FileLoader.getInstance(((PhotoViewer) this.f$0).currentAccount).getPathToMessage((TLRPC.Message) this.f$1);
        }
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        ArrayList<Long> arrayList;
        TLRPC.EncryptedChat encryptedChat;
        boolean z;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 1:
                int[] iArr = ((PassportActivity) obj2).currentExpireDate;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            default:
                ThemeActivity.ListAdapter listAdapter = (ThemeActivity.ListAdapter) obj2;
                listAdapter.getClass();
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj;
                MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, null, themeInfo == Theme.currentNightTheme, true);
                if (themeInfo.pathToFile == null) {
                    z = false;
                } else {
                    if (Theme.currentTheme == themeInfo) {
                        Theme.applyTheme(Theme.defaultTheme, true, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (themeInfo == Theme.currentNightTheme) {
                        Theme.currentNightTheme = (Theme.ThemeInfo) Theme.themesDict.get("Dark Blue");
                    }
                    NotificationCenter.getInstance(themeInfo.account).removeObserver(themeInfo, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(themeInfo.account).removeObserver(themeInfo, NotificationCenter.fileLoadFailed);
                    Theme.otherThemes.remove(themeInfo);
                    Theme.themesDict.remove(themeInfo.name);
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
                    if (overrideWallpaperInfo != null) {
                        Theme.OverrideWallpaperInfo.access$1300(overrideWallpaperInfo);
                    }
                    Theme.themes.remove(themeInfo);
                    new File(themeInfo.pathToFile).delete();
                    Theme.saveOtherThemes(true, false);
                }
                if (z) {
                    ((ActionBarLayout) ((BaseFragment) ThemeActivity.this).parentLayout).rebuildAllFragmentViews(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 3:
                ((PassportActivity) obj2).lambda$createPasswordInterface$8((TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 4:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) obj2;
                paymentFormActivity.waitingForEmail = true;
                paymentFormActivity.currentPassword.email_unconfirmed_pattern = (String) obj;
                paymentFormActivity.updatePasswordFields();
                break;
            case 7:
                PhotoViewer.AnonymousClass16 anonymousClass16 = (PhotoViewer.AnonymousClass16) obj2;
                anonymousClass16.getClass();
                Drawable[] drawableArr = PhotoViewer.progressDrawables;
                PhotoViewer.this.showShareAlert((ArrayList) obj);
                break;
            case 8:
                PhotoViewer photoViewer = PhotoViewer.this;
                if (!photoViewer.placeProvider.onDeletePhoto()) {
                    photoViewer.closePhoto(false, false);
                    break;
                } else {
                    ArrayList arrayList2 = photoViewer.imagesArr;
                    if (!arrayList2.isEmpty()) {
                        int i2 = photoViewer.currentIndex;
                        if (i2 >= 0 && i2 < arrayList2.size()) {
                            MessageObject messageObject = (MessageObject) arrayList2.get(photoViewer.currentIndex);
                            if (messageObject.isSent()) {
                                photoViewer.closePhoto(false, false);
                                ArrayList<Integer> arrayList3 = new ArrayList<>();
                                int i3 = photoViewer.slideshowMessageId;
                                if (i3 != 0) {
                                    arrayList3.add(Integer.valueOf(i3));
                                } else {
                                    arrayList3.add(Integer.valueOf(messageObject.getId()));
                                }
                                if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                                    arrayList = null;
                                    encryptedChat = null;
                                } else {
                                    ArrayList<Long> arrayList4 = new ArrayList<>();
                                    arrayList4.add(Long.valueOf(messageObject.messageOwner.random_id));
                                    arrayList = arrayList4;
                                    encryptedChat = MessagesController.getInstance(photoViewer.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                                }
                                MessagesController.getInstance(photoViewer.currentAccount).deleteMessages(arrayList3, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), ((boolean[]) obj)[0], messageObject.getChatMode());
                            }
                            break;
                        }
                    } else {
                        ArrayList arrayList5 = photoViewer.avatarsArr;
                        if (!arrayList5.isEmpty()) {
                            int i4 = photoViewer.currentIndex;
                            if (i4 >= 0 && i4 < arrayList5.size()) {
                                ArrayList arrayList6 = photoViewer.imagesArrMessages;
                                TLRPC.Message message = (TLRPC.Message) arrayList6.get(photoViewer.currentIndex);
                                if (message != null) {
                                    ArrayList<Integer> arrayList7 = new ArrayList<>();
                                    arrayList7.add(Integer.valueOf(message.id));
                                    MessagesController.getInstance(photoViewer.currentAccount).deleteMessages(arrayList7, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                                    NotificationCenter.getInstance(photoViewer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                }
                                if (photoViewer.isCurrentAvatarSet()) {
                                    if (photoViewer.avatarsDialogId > 0) {
                                        MessagesController.getInstance(photoViewer.currentAccount).deleteUserPhoto(null);
                                    } else {
                                        MessagesController.getInstance(photoViewer.currentAccount).changeChatAvatar(-photoViewer.avatarsDialogId, null, null, null, null, 0.0d, null, null, null, null);
                                    }
                                    photoViewer.closePhoto(false, false);
                                    break;
                                } else {
                                    TLRPC.Photo photo = (TLRPC.Photo) arrayList5.get(photoViewer.currentIndex);
                                    if (photo != null) {
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputPhoto.id = photo.id;
                                        tL_inputPhoto.access_hash = photo.access_hash;
                                        byte[] bArr = photo.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        if (photoViewer.avatarsDialogId > 0) {
                                            MessagesController.getInstance(photoViewer.currentAccount).deleteUserPhoto(tL_inputPhoto);
                                        }
                                        MessagesStorage.getInstance(photoViewer.currentAccount).clearUserPhoto(photoViewer.avatarsDialogId, photo.id);
                                        ArrayList arrayList8 = photoViewer.imagesArrLocations;
                                        arrayList8.remove(photoViewer.currentIndex);
                                        photoViewer.imagesArrLocationsSizes.remove(photoViewer.currentIndex);
                                        photoViewer.imagesArrLocationsVideo.remove(photoViewer.currentIndex);
                                        arrayList6.remove(photoViewer.currentIndex);
                                        arrayList5.remove(photoViewer.currentIndex);
                                        if (arrayList8.isEmpty()) {
                                            photoViewer.closePhoto(false, false);
                                        } else {
                                            int size = photoViewer.currentIndex;
                                            if (size >= arrayList5.size()) {
                                                size = arrayList5.size() - 1;
                                            }
                                            photoViewer.currentIndex = -1;
                                            photoViewer.setImageIndex(size);
                                        }
                                        if (message == null) {
                                            NotificationCenter.getInstance(photoViewer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                                        }
                                        break;
                                    }
                                }
                            }
                        } else {
                            ArrayList arrayList9 = photoViewer.secureDocuments;
                            if (!arrayList9.isEmpty() && photoViewer.placeProvider != null) {
                                arrayList9.remove(photoViewer.currentIndex);
                                photoViewer.placeProvider.deleteImageAtIndex(photoViewer.currentIndex);
                                if (!arrayList9.isEmpty()) {
                                    int size2 = photoViewer.currentIndex;
                                    if (size2 >= arrayList9.size()) {
                                        size2 = arrayList9.size() - 1;
                                    }
                                    photoViewer.currentIndex = -1;
                                    photoViewer.setImageIndex(size2);
                                } else {
                                    photoViewer.closePhoto(false, false);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((PrivacyControlActivity) obj2).applyCurrentPrivacySettings();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.clear;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ProfileActivity$$ExternalSyntheticLambda65(10, privacySettingsActivity, (TextCheckCell) obj));
                break;
            case 14:
                ((ProfileActivity) obj2).lambda$createView$23((CheckBoxCell[]) obj);
                break;
            case 15:
                ProfileActivity.AnonymousClass6 anonymousClass6 = (ProfileActivity.AnonymousClass6) obj2;
                anonymousClass6.getClass();
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                TLRPC.User user = (TLRPC.User) obj;
                arrayList10.add(user);
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.getContactsController().deleteContact(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.updateListAnimated(false, false);
                }
                break;
            case 17:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) obj2;
                selectChatUserSheet.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    selectChatUserSheet.lambda$showGiftOfferSheet$15();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    VoIPFragment$$ExternalSyntheticLambda42 voIPFragment$$ExternalSyntheticLambda42 = new VoIPFragment$$ExternalSyntheticLambda42(selectChatUserSheet, (TLRPC.User) obj, twoStepVerificationActivity, 17);
                    twoStepVerificationActivity.delegateType = 0;
                    twoStepVerificationActivity.delegate = voIPFragment$$ExternalSyntheticLambda42;
                    safeLastFragment.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.getClass();
                Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(i, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity2 = new TwoStepVerificationActivity();
                SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 = new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(20, starGiftSheet, twoStepVerificationActivity2);
                twoStepVerificationActivity2.delegateType = 2;
                twoStepVerificationActivity2.delegate = selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10;
                twoStepVerificationActivity2.delegateTypeString = starGiftSheet.getGiftName();
                progressMakeButtonLoading.init();
                twoStepVerificationActivity2.preload(new ProfileActivity$$ExternalSyntheticLambda149(starGiftSheet, (UserSelectorBottomSheet[]) obj, progressMakeButtonLoading, twoStepVerificationActivity2, 12));
                break;
            case 23:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj2;
                anonymousClass8.getClass();
                LivePlayer livePlayer = ((StoryViewer) obj).livePlayer;
                if (livePlayer == null) {
                    anonymousClass8.this$0.deleteStory();
                    break;
                } else if (!livePlayer.destroyed) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = livePlayer.inputCall;
                    ConnectionsManager.getInstance(livePlayer.currentAccount).sendRequest(discardgroupcall, new LivePlayer$$ExternalSyntheticLambda6(livePlayer, 5));
                    livePlayer.destroy();
                    break;
                }
                break;
            case 25:
                ((SuggestClearDatabaseBottomSheet) obj2).lambda$new$0((DialogsActivity) obj);
                break;
            case 26:
                ((ThemeActivity) obj2).lambda$createView$10((TodoItemMenu$$ExternalSyntheticLambda9) obj);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        switch (this.$r8$classId) {
            case 24:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                if (i < 0) {
                    page.getClass();
                    break;
                } else {
                    ArrayList arrayList2 = page.items;
                    if (i < arrayList2.size()) {
                        StoryPrivacyBottomSheet.ItemInner itemInner = (StoryPrivacyBottomSheet.ItemInner) arrayList2.get(i);
                        int i2 = itemInner.viewType;
                        int i3 = 0;
                        StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                        if (i2 == 3) {
                            if (itemInner.sendAs && storyPrivacyBottomSheet.canChangePeer) {
                                new StoryPrivacyBottomSheet.ChoosePeerSheet((Context) this.f$1, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, storyPrivacyBottomSheet.isLive, storyPrivacyBottomSheet.selectedPeer, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(page, 1), ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).show();
                            } else {
                                int i4 = itemInner.type;
                                if (i4 == 1) {
                                    if (storyPrivacyBottomSheet.selectedType == 1 || StoryPrivacyBottomSheet.access$6500(storyPrivacyBottomSheet).isEmpty()) {
                                        storyPrivacyBottomSheet.activePage = 1;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition$1(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 1;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 == 3) {
                                    if (storyPrivacyBottomSheet.selectedType == 3 || (storyPrivacyBottomSheet.selectedContacts.isEmpty() && storyPrivacyBottomSheet.selectedContactsByGroup.isEmpty())) {
                                        storyPrivacyBottomSheet.activePage = 3;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition$1(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 3;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 == 2) {
                                    if (storyPrivacyBottomSheet.selectedType == 2) {
                                        storyPrivacyBottomSheet.activePage = 2;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition$1(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 2;
                                    page.updateCheckboxes$1(true);
                                } else if (i4 != 4) {
                                    ArrayList arrayList3 = page.selectedUsers;
                                    HashMap map = page.selectedUsersByGroup;
                                    StoryPrivacyBottomSheet.Page.AnonymousClass1 anonymousClass1 = page.searchField;
                                    if (i4 > 0) {
                                        arrayList3.clear();
                                        map.clear();
                                        storyPrivacyBottomSheet.selectedType = itemInner.type;
                                        anonymousClass1.spansContainer.removeAllSpans();
                                    } else {
                                        TLRPC.Chat chat = itemInner.chat;
                                        LongSparseArray longSparseArray = page.changelog;
                                        if (chat != null) {
                                            long j = chat.id;
                                            if (StoryPrivacyBottomSheet.access$9900(storyPrivacyBottomSheet, chat) > 200) {
                                                try {
                                                    page.performHapticFeedback(3, 1);
                                                    break;
                                                } catch (Throwable unused) {
                                                }
                                                AlertDialog.Builder builder = new AlertDialog.Builder(page.getContext(), 0, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                                                String string = LocaleController.getString(R.string.GroupTooLarge);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.getString(R.string.GroupTooLargeMessage);
                                                ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                                            } else if (map.containsKey(Long.valueOf(j))) {
                                                ArrayList arrayList4 = (ArrayList) map.get(Long.valueOf(j));
                                                if (arrayList4 != null) {
                                                    int size = arrayList4.size();
                                                    while (i3 < size) {
                                                        Object obj = arrayList4.get(i3);
                                                        i3++;
                                                        longSparseArray.put(Boolean.FALSE, ((Long) obj).longValue());
                                                    }
                                                }
                                                map.remove(Long.valueOf(j));
                                                page.updateSpans(true);
                                            } else {
                                                TLRPC.Chat chat2 = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getChat(Long.valueOf(j));
                                                TLRPC.ChatFull chatFull = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getChatFull(j);
                                                if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                                                    AlertDialog alertDialog2 = page.progressDialog;
                                                    if (alertDialog2 != null) {
                                                        alertDialog2.dismiss();
                                                        page.progressDialog = null;
                                                    }
                                                    page.waitingForChatId = j;
                                                    AlertDialog alertDialog3 = new AlertDialog(page.getContext(), 3, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                                                    page.progressDialog = alertDialog3;
                                                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog3.showRunnable;
                                                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                                                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 50L);
                                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount);
                                                    messagesStorage.getStorageQueue().postRunnable(new PhotoViewer$$ExternalSyntheticLambda126(page, chat2, messagesStorage, j, 14));
                                                } else {
                                                    page.selectChat(j, chatFull.participants);
                                                }
                                                if (!TextUtils.isEmpty(page.query)) {
                                                    anonymousClass1.setText("");
                                                    page.query = null;
                                                    page.updateItems(false, true);
                                                }
                                            }
                                        } else {
                                            TLRPC.User user = itemInner.user;
                                            if (user != null) {
                                                if (page.pageType == 0) {
                                                    storyPrivacyBottomSheet.selectedType = 0;
                                                }
                                                long j2 = user.id;
                                                HashSet hashSet = new HashSet(arrayList3);
                                                if (arrayList3.contains(Long.valueOf(j2))) {
                                                    Iterator it = map.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        Map.Entry entry = (Map.Entry) it.next();
                                                        if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                            it.remove();
                                                            hashSet.addAll((Collection) entry.getValue());
                                                        }
                                                    }
                                                    hashSet.remove(Long.valueOf(j2));
                                                    longSparseArray.put(Boolean.FALSE, j2);
                                                } else {
                                                    Iterator it2 = map.entrySet().iterator();
                                                    while (it2.hasNext()) {
                                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                                        if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                                            it2.remove();
                                                            hashSet.addAll((Collection) entry2.getValue());
                                                        }
                                                    }
                                                    hashSet.add(Long.valueOf(j2));
                                                    if (!TextUtils.isEmpty(page.query)) {
                                                        anonymousClass1.setText("");
                                                        page.query = null;
                                                        page.updateItems(false, true);
                                                    }
                                                    longSparseArray.put(Boolean.TRUE, j2);
                                                }
                                                arrayList3.clear();
                                                arrayList3.addAll(hashSet);
                                                page.updateSpans(true);
                                            }
                                        }
                                    }
                                    page.updateCheckboxes$1(true);
                                    page.updateButton(true);
                                    anonymousClass1.scroll = true;
                                } else {
                                    if (storyPrivacyBottomSheet.selectedType == 4) {
                                        storyPrivacyBottomSheet.activePage = 4;
                                        storyPrivacyBottomSheet.viewPager.scrollToPosition$1(1);
                                    }
                                    storyPrivacyBottomSheet.selectedType = 4;
                                    page.updateCheckboxes$1(true);
                                }
                            }
                            break;
                        } else if (i2 != 7) {
                            if (i2 == 9) {
                                int i5 = itemInner.id;
                                if (i5 == 0) {
                                    StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7 = storyPrivacyBottomSheet.whenCoverClicked;
                                    if (storyRecorder$$ExternalSyntheticLambda7 != null) {
                                        storyRecorder$$ExternalSyntheticLambda7.run();
                                    }
                                } else if (i5 == 1) {
                                    TLRPC.InputPeer inputPeer = storyPrivacyBottomSheet.selectedPeer;
                                    long peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : UserConfig.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getClientUserId();
                                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(page, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider, view);
                                    itemOptionsMakeOptions.add(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new LinkManager$3$$ExternalSyntheticLambda0(page, peerDialogId, 26), false);
                                    itemOptionsMakeOptions.addGap();
                                    ItemOptions.addAlbumsItemOptions(itemOptionsMakeOptions, storyPrivacyBottomSheet.getStoriesController().getStoryAlbumsList(peerDialogId, true), storyPrivacyBottomSheet.selectedAlbums, false, null, new ThemeActivity$$ExternalSyntheticLambda19(5, page, itemOptionsMakeOptions));
                                    itemOptionsMakeOptions.show();
                                } else if (i5 == 5) {
                                    AlertDialog alertDialog4 = new AlertDialog(page.getContext(), 3, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider);
                                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog4.showRunnable;
                                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 500L);
                                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                    getgroupcallstreamrtmpurl.live_story = true;
                                    TLRPC.InputPeer tL_inputPeerSelf = storyPrivacyBottomSheet.selectedPeer;
                                    if (tL_inputPeerSelf == null) {
                                        tL_inputPeerSelf = new TLRPC.TL_inputPeerSelf();
                                    }
                                    getgroupcallstreamrtmpurl.peer = tL_inputPeerSelf;
                                    ConnectionsManager.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).sendRequest(getgroupcallstreamrtmpurl, new StarGiftSheet$$ExternalSyntheticLambda7(page, alertDialog4, getgroupcallstreamrtmpurl));
                                } else if (i5 == 6) {
                                    storyPrivacyBottomSheet.isRtmpStream = false;
                                    page.updateItems(true, true);
                                }
                            }
                            break;
                        } else if (view instanceof TextCell) {
                            TextCell textCell = (TextCell) view;
                            textCell.setChecked(!textCell.isChecked());
                            itemInner.checked = textCell.isChecked();
                            int i6 = itemInner.resId;
                            if (i6 == 0) {
                                boolean zIsChecked = textCell.isChecked();
                                storyPrivacyBottomSheet.allowScreenshots = zIsChecked;
                                i3 = storyPrivacyBottomSheet.selectedType == 4 ? 1 : 0;
                                if (!zIsChecked) {
                                    Bulletin bulletinCreateSimpleBulletin = new BulletinFactory(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.passcode_lock_close, 4, LocaleController.getString(i3 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                                    bulletinCreateSimpleBulletin.duration = 5000;
                                    bulletinCreateSimpleBulletin.show(true);
                                } else {
                                    Bulletin bulletinCreateSimpleBulletin2 = new BulletinFactory(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.ic_save_to_gallery, 4, LocaleController.getString(i3 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                                    bulletinCreateSimpleBulletin2.duration = 5000;
                                    bulletinCreateSimpleBulletin2.show(true);
                                }
                            } else if (i6 == 1) {
                                boolean zIsChecked2 = textCell.isChecked();
                                storyPrivacyBottomSheet.keepOnMyPage = zIsChecked2;
                                boolean z = storyPrivacyBottomSheet.selectedPeer instanceof TLRPC.TL_inputPeerChannel;
                                if (zIsChecked2) {
                                    Bulletin bulletinCreateSimpleBulletin3 = new BulletinFactory(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.msg_story_keep, 4, LocaleController.getString(z ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                                    bulletinCreateSimpleBulletin3.duration = 5000;
                                    bulletinCreateSimpleBulletin3.show(true);
                                } else {
                                    Bulletin bulletinCreateSimpleBulletin4 = new BulletinFactory(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).createSimpleBulletin(R.raw.fire_on, 4, LocaleController.getString(z ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                                    bulletinCreateSimpleBulletin4.duration = 5000;
                                    bulletinCreateSimpleBulletin4.show(true);
                                }
                                page.updateItems(true, true);
                            } else if (i6 == 2) {
                                storyPrivacyBottomSheet.allowComments = textCell.isChecked();
                                page.updateItems(true, true);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                ((ThemeActivity) this.f$0).lambda$createView$13((Context) this.f$1, view, i, f);
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        PremiumPreviewFragment.BackgroundView backgroundView = PremiumPreviewFragment.BackgroundView.this;
        PremiumGradient.PremiumGradientTools premiumGradientTools = PremiumPreviewFragment.this.tiersGradientTools;
        PremiumPreviewFragment.BackgroundView.AnonymousClass3.AnonymousClass1 anonymousClass1 = (PremiumPreviewFragment.BackgroundView.AnonymousClass3.AnonymousClass1) this.f$1;
        int measuredWidth = anonymousClass1.getMeasuredWidth();
        PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
        premiumGradientTools.gradientMatrix(0, 0.0f, 0, measuredWidth, -anonymousClass1.getTier().yOffset, premiumPreviewFragment.totalTiersGradientHeight);
        return premiumPreviewFragment.tiersGradientTools.paint;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$0;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i)).emoji.startsWith("animated_")) {
                    String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i)).emoji);
                    if (Emoji.getEmojiDrawable(strFixEmoji) != null) {
                        linkedHashSet.add(strFixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ((Runnable) this.f$1).run();
    }

    public SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(PollCreateActivity.AnonymousClass2 anonymousClass2, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.$r8$classId = 10;
        this.f$0 = anonymousClass2;
        this.f$1 = tL_messageMediaPoll;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        int i2 = 1;
        ThemeActivity.ListAdapter listAdapter = (ThemeActivity.ListAdapter) this.f$0;
        if (i >= 0) {
            ThemeActivity.ThemeAccentsListAdapter themeAccentsListAdapter = (ThemeActivity.ThemeAccentsListAdapter) this.f$1;
            if (i < themeAccentsListAdapter.themeAccents.size()) {
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeAccentsListAdapter.themeAccents.get(i);
                if (themeAccent.id >= 100 && !themeAccent.isDefault) {
                    ThemeActivity themeActivity = ThemeActivity.this;
                    AlertDialog.Builder builder = new AlertDialog.Builder(themeActivity.getParentActivity(), 0, null);
                    String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                    String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                    TLRPC.TL_theme tL_theme = themeAccent.info;
                    CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                    int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                    ImageUpdater$$ExternalSyntheticLambda3 imageUpdater$$ExternalSyntheticLambda3 = new ImageUpdater$$ExternalSyntheticLambda3(listAdapter, themeAccent, themeAccentsListAdapter, i2);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.items = charSequenceArr;
                    alertDialog.itemIcons = iArr;
                    alertDialog.onClickListener = imageUpdater$$ExternalSyntheticLambda3;
                    themeActivity.showDialog(alertDialog);
                    ArrayList arrayList = alertDialog.itemViews;
                    int size = arrayList.size() - 1;
                    int color = Theme.getColor(null, Theme.key_text_RedBold, false);
                    int color2 = Theme.getColor(null, Theme.key_text_RedRegular, false);
                    if (size >= 0 && size < arrayList.size()) {
                        AlertDialog.AlertDialogCell alertDialogCell = (AlertDialog.AlertDialogCell) arrayList.get(size);
                        alertDialogCell.textView.setTextColor(color);
                        alertDialogCell.imageView.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
