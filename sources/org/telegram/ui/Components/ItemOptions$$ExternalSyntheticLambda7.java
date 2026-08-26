package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatRightsEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.DataSettingsActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda120;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;

public final class ItemOptions$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ItemOptions$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        int positionForType;
        int adapterPosition;
        String pluralString;
        View view2;
        RecyclerView.ViewHolder childViewHolder;
        float[] fArr;
        int i = -1;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ItemOptions itemOptions = (ItemOptions) obj2;
                ((DialogsActivity$$ExternalSyntheticLambda120) obj).run();
                if (itemOptions.dismissWithButtons) {
                    itemOptions.dismiss();
                }
                break;
            case 1:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                int iIntValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog.Builder) obj2).alertDialog.dismissRunnable.run();
                ((DataSettingsActivity$$ExternalSyntheticLambda4) obj).onClick(null, iIntValue);
                break;
            case 3:
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) obj2;
                actionBarMenuItem.toggleSubMenu(null, null);
                AlertsCreator.ScheduleDatePickerColors scheduleDatePickerColors = (AlertsCreator.ScheduleDatePickerColors) obj;
                actionBarMenuItem.setPopupItemsColor(scheduleDatePickerColors.subMenuTextColor, false);
                actionBarMenuItem.setupPopupRadialSelectors(scheduleDatePickerColors.subMenuSelectorColor);
                actionBarMenuItem.redrawPopup(scheduleDatePickerColors.subMenuBackgroundColor);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj2;
                boolean z = !zArr[0];
                zArr[0] = z;
                ((CheckBoxCell) view).setChecked(z, true);
                ((QrActivity$$ExternalSyntheticLambda15) obj).run();
                break;
            case 5:
                ((BottomSheet.Builder) obj2).bottomSheet.dismissRunnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 6:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 7:
                ((AudioPlayerAlert) obj2).lambda$new$3((float[]) obj);
                break;
            case 8:
                AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) obj;
                audioPlayerAlert.getClass();
                ((ItemOptions) obj2).dismiss();
                audioPlayerAlert.onSubItemClick(7);
                break;
            case 9:
                AudioPlayerAlert audioPlayerAlert2 = ((AudioPlayerAlert.AnonymousClass7) obj2).this$0;
                if (MessagesController.getInstance(((BottomSheet) audioPlayerAlert2).currentAccount).getTotalDialogsCount() > 10) {
                    MarqueeTextView marqueeTextView = (MarqueeTextView) obj;
                    if (!TextUtils.isEmpty(marqueeTextView.getText().toString())) {
                        String string = marqueeTextView.getText().toString();
                        LaunchActivity launchActivity = audioPlayerAlert2.parentActivity;
                        if (((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment() instanceof DialogsActivity) {
                            DialogsActivity dialogsActivity = (DialogsActivity) ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment();
                            int totalDialogsCount = dialogsActivity.getMessagesController().getTotalDialogsCount();
                            if (!dialogsActivity.onlySelect && (totalDialogsCount > 10 || dialogsActivity.hasStories)) {
                                if (dialogsActivity.searching) {
                                    dialogsActivity.fragmentSearchField.editText.setText(string);
                                    dialogsActivity.fragmentSearchField.editText.setSelection(string.length());
                                    DialogsActivity.AnonymousClass47 anonymousClass47 = dialogsActivity.searchViewPager;
                                    if (anonymousClass47 != null && (positionForType = anonymousClass47.getPositionForType(3)) >= 0 && dialogsActivity.searchViewPager.getTabsView().getCurrentTabId() != positionForType) {
                                        dialogsActivity.searchViewPager.getTabsView().scrollToTab(positionForType, positionForType);
                                    }
                                } else {
                                    dialogsActivity.initialSearchType = 3;
                                    dialogsActivity.fragmentSearchField.editText.setText(string);
                                    dialogsActivity.fragmentSearchField.editText.setSelection(string.length());
                                }
                                audioPlayerAlert2.lambda$showGiftOfferSheet$15();
                            }
                        }
                        DialogsActivity dialogsActivity2 = new DialogsActivity(null);
                        dialogsActivity2.searchString = string;
                        dialogsActivity2.initialSearchType = 3;
                        ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(dialogsActivity2, false, false);
                        audioPlayerAlert2.lambda$showGiftOfferSheet$15();
                        break;
                    }
                }
                break;
            case 10:
                AvatarConstructorFragment avatarConstructorFragment = (AvatarConstructorFragment) obj2;
                avatarConstructorFragment.getClass();
                ((boolean[]) obj)[0] = true;
                avatarConstructorFragment.backgroundSelectView.selectGradient(avatarConstructorFragment.colorPickerGradient);
                avatarConstructorFragment.bottomSheet.lambda$showGiftOfferSheet$15();
                break;
            case 11:
                BlockingUpdateView blockingUpdateView = (BlockingUpdateView) obj2;
                blockingUpdateView.getClass();
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    LaunchActivity launchActivity2 = (LaunchActivity) obj;
                    if (BuildVars.isHuaweiStoreApp()) {
                        Browser.openUrl(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                    } else {
                        Browser.openUrl(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                    }
                    break;
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(blockingUpdateView.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = blockingUpdateView.appUpdate;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) blockingUpdateView.getContext(), blockingUpdateView.appUpdate.document)) {
                            FileLoader.getInstance(blockingUpdateView.accountNum).loadFile(blockingUpdateView.appUpdate.document, "update", 3, 1);
                            blockingUpdateView.showProgress(true);
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        Browser.openUrl(blockingUpdateView.getContext(), blockingUpdateView.appUpdate.url);
                    }
                    break;
                }
                break;
            case 12:
                CaptionPhotoViewer captionPhotoViewer = (CaptionPhotoViewer) obj2;
                ItemOptions itemOptions2 = captionPhotoViewer.timerPopup;
                if (itemOptions2 == null || !itemOptions2.isShown()) {
                    captionPhotoViewer.hint.hide(true);
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((LoginActivity.AnonymousClass4) obj, new DarkThemeResourceProvider(), captionPhotoViewer.timerButton);
                    captionPhotoViewer.timerPopup = itemOptionsMakeOptions;
                    itemOptionsMakeOptions.dimAlpha = 0;
                    itemOptionsMakeOptions.addText(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    captionPhotoViewer.timerPopup.addGap();
                    int[] iArr = captionPhotoViewer.values;
                    int length = iArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = iArr[i2];
                        captionPhotoViewer.timerPopup.add(0, i3 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i3 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i3, new Object[0]), new ArticleViewer$$ExternalSyntheticLambda74(captionPhotoViewer, i3, 21), false);
                        if (captionPhotoViewer.timer == i3) {
                            captionPhotoViewer.timerPopup.putCheck();
                        }
                    }
                    captionPhotoViewer.timerPopup.show();
                } else {
                    captionPhotoViewer.timerPopup.dismiss();
                    captionPhotoViewer.timerPopup = null;
                }
                break;
            case 13:
                ChatAttachAlertLocationLayout.MapOverlayView mapOverlayView = (ChatAttachAlertLocationLayout.MapOverlayView) obj2;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                ChatActivity chatActivity = (ChatActivity) chatAttachAlertLocationLayout.parentAlert.baseFragment;
                ChatAttachAlertLocationLayout.VenueLocation venueLocation = (ChatAttachAlertLocationLayout.VenueLocation) obj;
                if (chatActivity.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(chatAttachAlertLocationLayout.getParentActivity(), chatActivity.getDialogId(), -1L, 0, new ChatActivity$$ExternalSyntheticLambda189(26, mapOverlayView, venueLocation), null, chatAttachAlertLocationLayout.resourcesProvider);
                } else {
                    ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
                    AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new ArticleViewer$$ExternalSyntheticLambda21(24, mapOverlayView, venueLocation), 0L);
                }
                break;
            case 14:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                MessageSeenView.AnonymousClass1 anonymousClass1 = chatAttachAlertPollLayout.listView;
                View viewFindContainingItemView = anonymousClass1.findContainingItemView((ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6) obj);
                RecyclerView.ViewHolder childViewHolder2 = viewFindContainingItemView != null ? anonymousClass1.getChildViewHolder(viewFindContainingItemView) : null;
                if (childViewHolder2 != null && (adapterPosition = childViewHolder2.getAdapterPosition() - chatAttachAlertPollLayout.answerStartRow) >= 0 && adapterPosition < chatAttachAlertPollLayout.answers.length) {
                    if (((PollAttachedMedia) chatAttachAlertPollLayout.attachedMedia.medias.get(adapterPosition)) != null) {
                        chatAttachAlertPollLayout.openEditOrReplaceMenu(adapterPosition);
                    } else {
                        chatAttachAlertPollLayout.openAttachMenuForOptions(adapterPosition);
                    }
                    break;
                }
                break;
            case 15:
                final ChatAvatarContainer chatAvatarContainer = (ChatAvatarContainer) obj2;
                boolean z2 = chatAvatarContainer.secretChatTimer;
                ChatActivity chatActivity2 = chatAvatarContainer.parentFragment;
                if (z2) {
                    chatActivity2.showDialog(AlertsCreator.createTTLAlert(chatAvatarContainer.getContext(), chatActivity2.currentEncryptedChat, (Theme.ResourcesProvider) obj).alertDialog);
                    break;
                } else if (chatActivity2.getParentActivity() != null) {
                    TLRPC.Chat chat = chatActivity2.currentChat;
                    if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                        TLRPC.ChatFull chatFull = chatActivity2.chatInfo;
                        TLRPC.UserFull userFull = chatActivity2.userInfo;
                        int i4 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                        AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(chatAvatarContainer.getContext(), null, new AutoDeletePopupWrapper.Callback() {
                            public final ActionBarPopupWindow[] val$scrimPopupWindow;

                            public AnonymousClass2() {
                                actionBarPopupWindowArr = actionBarPopupWindowArr;
                            }

                            @Override
                            public final void dismiss() {
                                ActionBarPopupWindow actionBarPopupWindow = actionBarPopupWindowArr[0];
                                if (actionBarPopupWindow != null) {
                                    actionBarPopupWindow.dismiss();
                                }
                            }

                            @Override
                            public final void setAutoDeleteHistory(int i5, int i6) {
                                ChatActivity chatActivity3 = ChatAvatarContainer.this.parentFragment;
                                if (chatActivity3 == null) {
                                    return;
                                }
                                chatActivity3.getMessagesController().setDialogHistoryTTL(chatActivity3.getDialogId(), i5);
                                TLRPC.ChatFull chatFull2 = chatActivity3.chatInfo;
                                TLRPC.UserFull userFull2 = chatActivity3.userInfo;
                                if (userFull2 == null && chatFull2 == null) {
                                    return;
                                }
                                chatActivity3.createUndoView();
                                UndoView undoView = chatActivity3.undoView;
                                if (undoView != null) {
                                    undoView.showWithAction(chatActivity3.getDialogId(), i6, chatActivity3.getCurrentUser(), Integer.valueOf(userFull2 != null ? userFull2.ttl_period : chatFull2.ttl_period), (Runnable) null, (Runnable) null);
                                }
                            }

                            @Override
                            public final void showGlobalAutoDeleteScreen() {
                            }
                        }, true, 0, chatAvatarContainer.resourcesProvider);
                        autoDeletePopupWrapper.updateItems(i4);
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = autoDeletePopupWrapper.windowLayout;
                        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout) {
                            public AnonymousClass3(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2) {
                                super(actionBarPopupWindowLayout2);
                            }

                            @Override
                            public final void dismiss() {
                                dismiss(true);
                                ChatActivity chatActivity3 = ChatAvatarContainer.this.parentFragment;
                                if (chatActivity3 != null) {
                                    chatActivity3.dimBehindView(false, true, 0.0f);
                                }
                            }
                        };
                        final ActionBarPopupWindow[] actionBarPopupWindowArr = {actionBarPopupWindow};
                        actionBarPopupWindow.pauseNotifications = true;
                        actionBarPopupWindow.dismissAnimationDuration = 220;
                        actionBarPopupWindow.setOutsideTouchable(true);
                        actionBarPopupWindowArr[0].setClippingEnabled(true);
                        actionBarPopupWindowArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                        actionBarPopupWindowArr[0].setFocusable(true);
                        actionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        actionBarPopupWindowArr[0].setInputMethodMode(2);
                        actionBarPopupWindowArr[0].getContentView().setFocusableInTouchMode(true);
                        ActionBarPopupWindow actionBarPopupWindow2 = actionBarPopupWindowArr[0];
                        ChatAvatarContainer.AnonymousClass1 anonymousClass2 = chatAvatarContainer.avatarImageView;
                        actionBarPopupWindow2.showAtLocation(anonymousClass2, 0, (int) (chatAvatarContainer.getX() + anonymousClass2.getX()), (int) anonymousClass2.getY());
                        chatActivity2.dimBehindView(false, true, 0.2f);
                        break;
                    } else if (chatAvatarContainer.animatorTimeVisible.value && chatActivity2.getParentActivity() != null && chatActivity2.fragmentView != null && chatActivity2.chatInfo != null) {
                        if (chatActivity2.timerHintView == null) {
                            HintView hintView = new HintView(7, chatActivity2.getParentActivity(), chatActivity2.themeDelegate, true);
                            chatActivity2.timerHintView = hintView;
                            hintView.setAlpha(0.0f);
                            chatActivity2.timerHintView.setVisibility(4);
                            chatActivity2.timerHintView.setShowingDuration(4000L);
                            chatActivity2.contentView.addView(chatActivity2.timerHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        }
                        int i5 = chatActivity2.chatInfo.ttl_period;
                        if (i5 > 86400) {
                            pluralString = LocaleController.formatPluralString("Days", i5 / 86400, new Object[0]);
                        } else if (i5 >= 3600) {
                            pluralString = LocaleController.formatPluralString("Hours", i5 / 3600, new Object[0]);
                        } else {
                            pluralString = i5 >= 60 ? LocaleController.formatPluralString("Minutes", i5 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i5, new Object[0]);
                        }
                        chatActivity2.timerHintView.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, pluralString));
                        chatActivity2.timerHintView.showForView(chatActivity2.avatarContainer.getTimeItem(), true);
                        break;
                    }
                }
                break;
            case 16:
                ((ChatThemeBottomSheet) obj2).lambda$new$4((ChatActivity) obj);
                break;
            case 17:
                ((CreateRtmpStreamBottomSheet) obj2).getClass();
                ThemeActivity$$ExternalSyntheticLambda19 themeActivity$$ExternalSyntheticLambda19 = (ThemeActivity$$ExternalSyntheticLambda19) obj;
                themeActivity$$ExternalSyntheticLambda19.getClass();
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) themeActivity$$ExternalSyntheticLambda19.f$0;
                StoryPrivacyBottomSheet.this.isRtmpStream = true;
                ((CreateRtmpStreamBottomSheet[]) themeActivity$$ExternalSyntheticLambda19.f$1)[0].lambda$showGiftOfferSheet$15();
                page.updateItems(true, true);
                break;
            case 18:
                ((CreateRtmpStreamBottomSheet) obj2).lambda$new$7((TLRPC.Peer) obj);
                break;
            case 19:
                CustomPhoneKeyboardView customPhoneKeyboardView = (CustomPhoneKeyboardView) obj2;
                if (customPhoneKeyboardView.editText == null && (view2 = customPhoneKeyboardView.viewToFindFocus) != null) {
                    View viewFindFocus = view2.findFocus();
                    if (viewFindFocus instanceof EditText) {
                        customPhoneKeyboardView.editText = (EditText) viewFindFocus;
                    }
                }
                if (customPhoneKeyboardView.editText != null) {
                    try {
                        customPhoneKeyboardView.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    EditText editText = customPhoneKeyboardView.editText;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = customPhoneKeyboardView.editText.getText();
                    String str = (String) obj;
                    int length2 = customPhoneKeyboardView.editText.getSelectionEnd() == customPhoneKeyboardView.editText.length() ? -1 : str.length() + customPhoneKeyboardView.editText.getSelectionStart();
                    if (customPhoneKeyboardView.editText.getSelectionStart() == -1 || customPhoneKeyboardView.editText.getSelectionEnd() == -1) {
                        customPhoneKeyboardView.editText.setText(str);
                        EditText editText2 = customPhoneKeyboardView.editText;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = customPhoneKeyboardView.editText;
                        editText3.setText(text.replace(editText3.getSelectionStart(), customPhoneKeyboardView.editText.getSelectionEnd(), str));
                        EditText editText4 = customPhoneKeyboardView.editText;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = customPhoneKeyboardView.editText;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                    }
                    break;
                }
                break;
            case 20:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = (DeleteMessagesBottomSheet) obj2;
                deleteMessagesBottomSheet.saveScrollPosition$2();
                DeleteMessagesBottomSheet.Action action = (DeleteMessagesBottomSheet.Action) obj;
                action.collapsed = !action.collapsed;
                DeleteMessagesBottomSheet.this.adapter.update(true);
                deleteMessagesBottomSheet.applyScrolledPosition$1();
                break;
            case 21:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = (DeleteMessagesBottomSheet) obj2;
                deleteMessagesBottomSheet2.restrictUserCollapsed = !deleteMessagesBottomSheet2.restrictUserCollapsed;
                ((UniversalAdapter) obj).update(true);
                break;
            case 22:
                ((DownloadsInfoBottomSheet) obj2).lambda$showGiftOfferSheet$15();
                ((BaseFragment) obj).presentFragment(new CacheControlActivity());
                break;
            case 23:
                ((EmojiPacksAlert) obj2).lambda$new$1((AnimatedEmojiSpan) obj);
                break;
            case 24:
                EmojiView.StickersGridAdapter stickersGridAdapter = (EmojiView.StickersGridAdapter) obj2;
                EmojiView emojiView = EmojiView.this;
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) obj;
                EmojiView.AnonymousClass19 anonymousClass19 = emojiView.stickersGridView;
                if (anonymousClass19.indexOfChild(stickerSetNameCell) != -1 && (childViewHolder = anonymousClass19.getChildViewHolder(stickerSetNameCell)) != null) {
                    if (childViewHolder.getAdapterPosition() == emojiView.groupStickerPackPosition) {
                        if (emojiView.groupStickerSet != null) {
                            EmojiView.EmojiViewDelegate emojiViewDelegate = emojiView.delegate;
                            if (emojiViewDelegate != null) {
                                emojiViewDelegate.onStickersGroupClick(emojiView.info.id);
                            }
                        } else {
                            SharedPreferences.Editor editorEdit = MessagesController.getEmojiSettings(emojiView.currentAccount).edit();
                            String str2 = "group_hide_stickers_" + emojiView.info.id;
                            TLRPC.StickerSet stickerSet = emojiView.info.stickerset;
                            editorEdit.putLong(str2, stickerSet != null ? stickerSet.id : 0L).apply();
                            emojiView.updateStickerTabs(false);
                            EmojiView.StickersGridAdapter stickersGridAdapter2 = emojiView.stickersGridAdapter;
                            if (stickersGridAdapter2 != null) {
                                stickersGridAdapter2.updateItems$4();
                                stickersGridAdapter2.mObservable.notifyChanged();
                            }
                        }
                    } else if (stickersGridAdapter.cache.get(childViewHolder.getAdapterPosition()) == emojiView.recentStickers) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(stickersGridAdapter.context, 0, null);
                        String string2 = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string2;
                        alertDialog.message = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ColorPicker$$ExternalSyntheticLambda6(stickersGridAdapter, 25));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        alertDialog.show();
                        TextView textView = (TextView) alertDialog.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        }
                    }
                }
                break;
            case 25:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                fragmentContextView.getClass();
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.isMusic);
                int i6 = 0;
                while (true) {
                    fArr = (float[]) obj;
                    if (i6 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i6]) {
                            i = i6;
                        } else {
                            i6++;
                        }
                    }
                }
                int i7 = i + 1;
                if (i7 >= 3) {
                    i7 = 0;
                }
                float f = fArr[i7];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.isMusic, f);
                fragmentContextView.playbackSpeedChanged(playbackSpeed, f, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - fragmentContextView.lastPlaybackClick > 300) {
                    int i8 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i8 > 2) {
                        i8 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i8).apply();
                    if (i8 >= 0 && fragmentContextView.fragment != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        FragmentContextView.AnonymousClass9 anonymousClass9 = new FragmentContextView.AnonymousClass9(6, fragmentContextView.getContext(), null, true);
                        fragmentContextView.speedHintView = anonymousClass9;
                        anonymousClass9.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.speedHintView.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.speedHintView, marginLayoutParams);
                        fragmentContextView.speedHintView.showForView(fragmentContextView.playbackSpeedButton, true);
                    }
                }
                fragmentContextView.lastPlaybackClick = jCurrentTimeMillis;
                break;
            case 26:
                FragmentSearchField fragmentSearchField = (FragmentSearchField) obj2;
                ActionBarMenuItem.SearchFilterView searchFilterView = (ActionBarMenuItem.SearchFilterView) obj;
                int iIndexOf = fragmentSearchField.currentSearchFilters.indexOf(searchFilterView.getFilter());
                if (fragmentSearchField.selectedFilterIndex != iIndexOf) {
                    fragmentSearchField.selectedFilterIndex = iIndexOf;
                    fragmentSearchField.onFiltersChanged();
                } else if (searchFilterView.getFilter().removable) {
                    if (searchFilterView.animatorIsSelected.value) {
                        FiltersView.MediaFilterData filter = searchFilterView.getFilter();
                        fragmentSearchField.removeSearchFilter(filter);
                        FragmentSearchField.SearchFiltersListener searchFiltersListener = fragmentSearchField.searchFiltersListener;
                        if (searchFiltersListener != null) {
                            ((DialogsActivity.AnonymousClass9) searchFiltersListener).onSearchFilterCleared(filter);
                        }
                    } else {
                        searchFilterView.setSelectedForDelete(true);
                    }
                }
                break;
            case 27:
                ((DialogCell$$ExternalSyntheticLambda6) obj).run(Long.valueOf(((GalleryEmptyView) obj2).emojiDocumentId));
                break;
            case 28:
                GuardBotReplaceSheet guardBotReplaceSheet = (GuardBotReplaceSheet) obj2;
                guardBotReplaceSheet.getClass();
                ((ChatRightsEditActivity$$ExternalSyntheticLambda5) obj).run();
                guardBotReplaceSheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                ((ItemOptions) obj2).dismiss();
                ((PollItemMenu$$ExternalSyntheticLambda12) obj).run();
                break;
        }
    }

    public ItemOptions$$ExternalSyntheticLambda7(AudioPlayerAlert audioPlayerAlert, ItemOptions itemOptions) {
        this.$r8$classId = 8;
        this.f$1 = audioPlayerAlert;
        this.f$0 = itemOptions;
    }

    public ItemOptions$$ExternalSyntheticLambda7(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ThemeActivity$$ExternalSyntheticLambda19 themeActivity$$ExternalSyntheticLambda19, ButtonWithCounterView buttonWithCounterView) {
        this.$r8$classId = 17;
        this.f$0 = createRtmpStreamBottomSheet;
        this.f$1 = themeActivity$$ExternalSyntheticLambda19;
    }
}
