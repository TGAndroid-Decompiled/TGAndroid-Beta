package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.stripe.android.Stripe;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda52;
import org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass21;
import org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass37;
import org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass47;
import org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass48;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.bots.BotCommandsMenuContainer;
import org.telegram.ui.bots.BotCommandsMenuView;

public final class ChatActivityEnterView$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda5(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        boolean z;
        ChatActivityEnterView.AnonymousClass78 anonymousClass78;
        ChatActivityEnterView.AnonymousClass50 anonymousClass50;
        ?? r10;
        TLRPC.ChatFull chatFull;
        int i;
        int iDp;
        ArrayList arrayList;
        char c;
        boolean z2;
        TLRPC.Peer defaultSendAs = null;
        boolean z3 = false;
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (chatActivityEnterView.streamingState == BotForumHelper.SteamingSendButtonState.STOP && (chatActivityEnterViewDelegate = chatActivityEnterView.delegate) != null) {
                    chatActivityEnterViewDelegate.didPressStreamingStop();
                    break;
                }
                break;
            case 1:
                AdjustPanLayoutHelper adjustPanLayoutHelper = chatActivityEnterView.adjustPanLayoutHelper;
                if ((adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress) && chatActivityEnterView.attachLayoutPaddingAlpha != 0.0f) {
                    chatActivityEnterView.delegate.didPressAttachButton();
                }
                break;
            case 2:
                chatActivityEnterView.openRichEditor();
                break;
            case 3:
                ChatActivityEnterView.AnonymousClass50 anonymousClass51 = chatActivityEnterView.messageEditText;
                String string = anonymousClass51 != null ? anonymousClass51.getText().toString() : "";
                int iIndexOf = string.indexOf(32);
                if (iIndexOf == -1 || iIndexOf == string.length() - 1) {
                    chatActivityEnterView.setFieldText("");
                } else {
                    chatActivityEnterView.setFieldText(string.substring(0, iIndexOf + 1));
                }
                break;
            case 4:
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatActivityEnterView.messageSendPreview;
                if (anonymousClass25 == null || anonymousClass25.dismissing) {
                    AnimatorSet animatorSet = chatActivityEnterView.runningAnimationAudio;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.moveToSendStateRunnable == null) {
                        chatActivityEnterView.sendMessage();
                    }
                }
                break;
            case 5:
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate2 != null) {
                    chatActivityEnterViewDelegate2.openScheduledMessages();
                }
                break;
            case 6:
                if (chatActivityEnterView.editingBusinessLink != null) {
                    if (chatActivityEnterView.currentLimit - chatActivityEnterView.codePointCount < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.captionLimitView;
                        if (numberTextView != null) {
                            AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                            try {
                                chatActivityEnterView.captionLimitView.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    } else {
                        ChatActivityEnterView.BusinessLinkPresetMessage businessLinkPresetMessageCalculateBusinessLinkPresetMessage = chatActivityEnterView.calculateBusinessLinkPresetMessage();
                        chatActivityEnterView.lastSavedBusinessLinkMessage = businessLinkPresetMessageCalculateBusinessLinkPresetMessage;
                        BusinessLinksController businessLinksController = BusinessLinksController.getInstance(chatActivityEnterView.currentAccount);
                        String str = chatActivityEnterView.editingBusinessLink.link;
                        String str2 = businessLinkPresetMessageCalculateBusinessLinkPresetMessage.text;
                        ArrayList<TLRPC.MessageEntity> arrayList2 = businessLinkPresetMessageCalculateBusinessLinkPresetMessage.entities;
                        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView, 17);
                        TL_account.TL_businessChatLink tL_businessChatLinkFindLink = businessLinksController.findLink(str);
                        if (tL_businessChatLinkFindLink != null) {
                            TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                            tL_inputBusinessChatLink.message = str2;
                            tL_inputBusinessChatLink.entities = arrayList2;
                            tL_inputBusinessChatLink.title = tL_businessChatLinkFindLink.title;
                            businessLinksController.editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, chatActivityEnterView$$ExternalSyntheticLambda4);
                            break;
                        }
                    }
                }
                break;
            case 7:
                if (chatActivityEnterView.expandStickersButton.getVisibility() == 0 && chatActivityEnterView.expandStickersButton.getAlpha() == 1.0f && !chatActivityEnterView.waitingForKeyboardOpen) {
                    if (!chatActivityEnterView.keyboardVisible || (anonymousClass50 = chatActivityEnterView.messageEditText) == null || !anonymousClass50.isFocused()) {
                        if (!chatActivityEnterView.stickersExpanded) {
                            if (!chatActivityEnterView.stickersDragging) {
                                z = true;
                                chatActivityEnterView.emojiView.showSearchField(true);
                            }
                            if (!chatActivityEnterView.stickersDragging) {
                                chatActivityEnterView.setStickersExpanded(chatActivityEnterView.stickersExpanded ^ z, z, false, z);
                            }
                            break;
                        } else if (chatActivityEnterView.searchingType != 0) {
                            chatActivityEnterView.setSearchingTypeInternal(0, true);
                            chatActivityEnterView.emojiView.closeSearch(-1L, true);
                            chatActivityEnterView.emojiView.hideSearchKeyboard();
                            if (chatActivityEnterView.emojiTabOpen) {
                                chatActivityEnterView.checkSendButton(true);
                            }
                        } else if (!chatActivityEnterView.stickersDragging && (anonymousClass78 = chatActivityEnterView.emojiView) != null) {
                            anonymousClass78.showSearchField(false);
                        }
                        z = true;
                        if (!chatActivityEnterView.stickersDragging) {
                            chatActivityEnterView.setStickersExpanded(chatActivityEnterView.stickersExpanded ^ z, z, false, z);
                        }
                    }
                    break;
                }
                break;
            case 8:
                AnimatorSet animatorSet2 = chatActivityEnterView.runningAnimationAudio;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    RecordedAudioPlayerView recordedAudioPlayerView = chatActivityEnterView.audioTimelineView;
                    if (recordedAudioPlayerView != null) {
                        recordedAudioPlayerView.setPlaying(false);
                    }
                    if (chatActivityEnterView.videoToSendMessageObject != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.onFinishInitCameraRunnable);
                        chatActivityEnterView.delegate.needStartRecordVideo(2, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                        chatActivityEnterView.effectId = 0L;
                        chatActivityEnterView.sendButton.setEffect(0L);
                    } else {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.audioToSendMessageObject) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        }
                    }
                    if (chatActivityEnterView.audioToSendPath != null) {
                        if (BuildVars.LOGS_ENABLED) {
                            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(chatActivityEnterView.audioToSendPath, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.audioToSendPath).delete();
                    }
                    MediaController.getInstance().cleanRecording(true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.currentAccount);
                    long j = chatActivityEnterView.dialog_id;
                    ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                    mediaDataController.pushDraftVoiceMessage(j, (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId(), null);
                    MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                    chatActivityEnterView.millisecondsRecorded = 0L;
                    chatActivityEnterView.hideRecordedAudioPanel(false);
                    chatActivityEnterView.checkSendButton(true);
                }
                break;
            case 9:
                BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
                boolean z4 = botCommandsMenuView.isOpened;
                botCommandsMenuView.setOpened(!z4);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.hasBotWebView()) {
                    if (!z4) {
                        if (chatActivityEnterView.emojiViewVisible || chatActivityEnterView.botKeyboardViewVisible) {
                            AndroidUtilities.runOnUIThread(new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView, 16), 275L);
                            chatActivityEnterView.hidePopup(false, false, true);
                        } else {
                            chatActivityEnterView.openWebViewMenu();
                        }
                    }
                } else if (z4) {
                    ChatActivityEnterView.AnonymousClass47 anonymousClass47 = chatActivityEnterView.botCommandsMenuContainer;
                    if (anonymousClass47 != null) {
                        anonymousClass47.dismiss();
                    }
                } else {
                    if (chatActivityEnterView.botCommandsMenuContainer == null) {
                        ChatActivityEnterView.AnonymousClass47 anonymousClass48 = chatActivityEnterView.new AnonymousClass47(chatActivityEnterView.getContext());
                        chatActivityEnterView.botCommandsMenuContainer = anonymousClass48;
                        chatActivityEnterView.getContext();
                        anonymousClass48.listView.setLayoutManager(new LinearLayoutManager(1, false));
                        BotCommandsMenuContainer.AnonymousClass1 anonymousClass1 = chatActivityEnterView.botCommandsMenuContainer.listView;
                        BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter = new BotCommandsMenuView.BotCommandsAdapter();
                        chatActivityEnterView.botCommandsAdapter = botCommandsAdapter;
                        anonymousClass1.setAdapter(botCommandsAdapter);
                        chatActivityEnterView.botCommandsMenuContainer.listView.setOnItemClickListener(chatActivityEnterView.new AnonymousClass48());
                        chatActivityEnterView.botCommandsMenuContainer.listView.setOnItemLongClickListener(chatActivityEnterView.new AnonymousClass21());
                        chatActivityEnterView.botCommandsMenuContainer.setClipToPadding(false);
                        chatActivityEnterView.sizeNotifierLayout.addView(chatActivityEnterView.botCommandsMenuContainer, LayoutHelper.createFrame(-1, -1, 80));
                        chatActivityEnterView.botCommandsMenuContainer.setVisibility(8);
                        LongSparseArray longSparseArray = chatActivityEnterView.lastBotInfo;
                        if (longSparseArray != null) {
                            chatActivityEnterView.botCommandsAdapter.setBotInfo(longSparseArray);
                        }
                        chatActivityEnterView.updateBotCommandsMenuContainerTopPadding();
                    }
                    ChatActivityEnterView.AnonymousClass47 anonymousClass49 = chatActivityEnterView.botCommandsMenuContainer;
                    if (anonymousClass49.getVisibility() != 0) {
                        anonymousClass49.setVisibility(0);
                        anonymousClass49.listView.scrollToPosition(0);
                        anonymousClass49.entering = true;
                        anonymousClass49.dismissed = false;
                    } else if (anonymousClass49.dismissed) {
                        anonymousClass49.dismissed = false;
                        anonymousClass49.cancelCurrentAnimation();
                        anonymousClass49.playEnterAnim(false);
                    }
                }
                break;
            case 10:
                SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(chatActivityEnterView.currentAccount);
                ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
                if (BirthdayController.isToday(chatActivity2.userInfo)) {
                    editorM.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivity2.getDialogId(), false);
                } else {
                    editorM.putBoolean("show_gift_for_" + chatActivity2.getDialogId(), false);
                }
                if (MessagesController.getInstance(chatActivityEnterView.currentAccount).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.currentAccount).giftTextFieldIcon) {
                    editorM.putBoolean("show_gift_for_" + chatActivity2.getDialogId(), false);
                }
                editorM.apply();
                TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.currentAccount).getUserFull(UserConfig.getInstance(chatActivityEnterView.currentAccount).getClientUserId());
                if ((chatActivityEnterView.getParentFragment().userInfo == null || !chatActivityEnterView.getParentFragment().userInfo.display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
                    AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.giftButton, false);
                }
                TLRPC.User currentUser = chatActivityEnterView.getParentFragment().getCurrentUser();
                if (currentUser != null) {
                    boolean z5 = chatActivityEnterView.getParentFragment().userInfo != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().userInfo.birthday);
                    AlertDialog alertDialog = new AlertDialog(chatActivityEnterView.getContext(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
                    alertDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(chatActivityEnterView, BoostRepository.loadGiftOptions(chatActivityEnterView.currentAccount, null, new PeerStoriesView$38$$ExternalSyntheticLambda1(chatActivityEnterView, alertDialog, currentUser, z5)), 3));
                    break;
                }
                break;
            case 11:
                chatActivityEnterView.openRichEditor();
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                ChatActivityEnterView.AnonymousClass44 anonymousClass44 = chatActivityEnterView2.sendPopupWindow;
                if (anonymousClass44 != null && anonymousClass44.isShowing()) {
                    chatActivityEnterView2.sendPopupWindow.dismiss();
                }
                chatActivityEnterView2.sendMessageInternal(2147483646, true, 0, true, 0L);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f$0;
                ChatActivityEnterView.AnonymousClass44 anonymousClass45 = chatActivityEnterView3.sendPopupWindow;
                if (anonymousClass45 != null && anonymousClass45.isShowing()) {
                    chatActivityEnterView3.sendPopupWindow.dismiss();
                }
                chatActivityEnterView3.sendMessageInternal(0, false, 0, true, 0L);
                break;
            case 14:
                ChatActivityEnterView.AnonymousClass44 anonymousClass46 = chatActivityEnterView.sendPopupWindow;
                if (anonymousClass46 != null && anonymousClass46.isShowing()) {
                    chatActivityEnterView.sendPopupWindow.dismiss();
                }
                AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.parentFragment.getDialogId(), -1L, 0, new Stripe.AnonymousClass1(chatActivityEnterView, 24), null, chatActivityEnterView.resourcesProvider);
                break;
            case 15:
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate3 != null && !chatActivityEnterViewDelegate3.checkCanRemoveRestrictionsByBoosts()) {
                    ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate4 = chatActivityEnterView.delegate;
                    ChatActivityEnterView.SlowModeBtn slowModeBtn = chatActivityEnterView.slowModeButton;
                    chatActivityEnterViewDelegate4.onUpdateSlowModeButton(slowModeBtn.textView.getText(), slowModeBtn, true);
                    break;
                }
                break;
            case 16:
                if (chatActivityEnterView.searchingType != 0) {
                    chatActivityEnterView.setSearchingTypeInternal(0, false);
                    chatActivityEnterView.emojiView.closeSearch(-1L, false);
                    ChatActivityEnterView.AnonymousClass50 anonymousClass52 = chatActivityEnterView.messageEditText;
                    if (anonymousClass52 != null) {
                        anonymousClass52.requestFocus();
                    }
                }
                if (chatActivityEnterView.botReplyMarkup != null) {
                    if (chatActivityEnterView.isPopupShowing()) {
                        r10 = 1;
                        if (chatActivityEnterView.currentPopupContentType == 1) {
                            if (chatActivityEnterView.isPopupShowing() && chatActivityEnterView.currentPopupContentType == 1) {
                                chatActivityEnterView.showPopup(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.showPopup(r10, r10, r10, r10);
                } else if (chatActivityEnterView.hasBotCommands) {
                    chatActivityEnterView.setFieldText("/");
                    ChatActivityEnterView.AnonymousClass50 anonymousClass53 = chatActivityEnterView.messageEditText;
                    if (anonymousClass53 != null) {
                        anonymousClass53.requestFocus();
                    }
                    chatActivityEnterView.openKeyboard();
                }
                if (chatActivityEnterView.stickersExpanded) {
                    chatActivityEnterView.setStickersExpanded(false, false, false, true);
                }
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView4 = this.f$0;
                if (!chatActivityEnterView4.isLiveComment ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.isPopupShowing()) {
                    if (chatActivityEnterView4.delegate.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        int contentViewHeight = chatActivityEnterView4.delegate.getContentViewHeight();
                        int iMeasureKeyboardHeight = chatActivityEnterView4.delegate.measureKeyboardHeight();
                        if (iMeasureKeyboardHeight <= AndroidUtilities.dp(20.0f)) {
                            contentViewHeight += iMeasureKeyboardHeight;
                        }
                        if (chatActivityEnterView4.emojiViewVisible) {
                            contentViewHeight -= chatActivityEnterView4.getEmojiPadding();
                        }
                        if (contentViewHeight < AndroidUtilities.dp(200.0f)) {
                            chatActivityEnterView4.onKeyboardClosed = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView4, 2);
                            AndroidUtilities.hideKeyboard(chatActivityEnterView4.messageEditText);
                        }
                    }
                    if (chatActivityEnterView4.delegate.getSendAsPeers() != null) {
                        try {
                            view.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused3) {
                        }
                        ChatActivityEnterView.AnonymousClass37 anonymousClass37 = chatActivityEnterView4.senderSelectPopupWindow;
                        if (anonymousClass37 != null) {
                            anonymousClass37.pauseNotifications = false;
                            anonymousClass37.startDismissAnimation(new SpringAnimation[0]);
                        } else {
                            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView4.currentAccount);
                            if (chatActivityEnterView4.isLiveComment) {
                                defaultSendAs = chatActivityEnterView4.delegate.getDefaultSendAs();
                                chatFull = null;
                            } else {
                                MessagesController.getInstance(chatActivityEnterView4.currentAccount).getChat(Long.valueOf(-chatActivityEnterView4.dialog_id));
                                chatFull = MessagesController.getInstance(chatActivityEnterView4.currentAccount).getChatFull(-chatActivityEnterView4.dialog_id);
                                if (chatFull != null) {
                                    defaultSendAs = chatFull.default_send_as;
                                }
                            }
                            if (defaultSendAs == null && chatActivityEnterView4.delegate.getSendAsPeers() != null && !chatActivityEnterView4.delegate.getSendAsPeers().peers.isEmpty()) {
                                defaultSendAs = chatActivityEnterView4.delegate.getSendAsPeers().peers.get(0).peer;
                            }
                            TLRPC.Peer peer = defaultSendAs;
                            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView4.dialog_id)));
                            boolean z6 = chatActivityEnterView4.isLiveComment;
                            ChatActivity chatActivity3 = chatActivityEnterView4.parentFragment;
                            if (z6) {
                            } else {
                                ((ActionBarLayout) chatActivity3.getParentLayout()).getOverlayContainerView();
                            }
                            ChatActivityEnterView.AnonymousClass37 anonymousClass38 = chatActivityEnterView4.new AnonymousClass37(chatActivityEnterView4.getContext(), chatActivityEnterView4.parentFragment, messagesController, zIsChannelAndNotMegaGroup, peer, chatActivityEnterView4.delegate.getSendAsPeers(), new ChatActivity$$ExternalSyntheticLambda248(chatActivityEnterView4, chatFull, messagesController, 22), chatActivityEnterView4.resourcesProvider);
                            chatActivityEnterView4.senderSelectPopupWindow = anonymousClass38;
                            anonymousClass38.pauseNotifications = true;
                            anonymousClass38.dismissAnimationDuration = 220;
                            anonymousClass38.setOutsideTouchable(true);
                            chatActivityEnterView4.senderSelectPopupWindow.setClippingEnabled(true);
                            chatActivityEnterView4.senderSelectPopupWindow.setFocusable(true);
                            chatActivityEnterView4.senderSelectPopupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            chatActivityEnterView4.senderSelectPopupWindow.setInputMethodMode(2);
                            chatActivityEnterView4.senderSelectPopupWindow.setSoftInputMode(0);
                            chatActivityEnterView4.senderSelectPopupWindow.getContentView().setFocusableInTouchMode(true);
                            chatActivityEnterView4.senderSelectPopupWindow.animationEnabled = false;
                            int i2 = -AndroidUtilities.dp(4.0f);
                            int[] iArr = new int[2];
                            if (!AndroidUtilities.isTablet() || chatActivity3 == null) {
                                i = i2;
                            } else {
                                chatActivity3.getFragmentView().getLocationInWindow(iArr);
                                i = iArr[0] + i2;
                            }
                            int contentViewHeight2 = chatActivityEnterView4.delegate.getContentViewHeight();
                            int measuredHeight = chatActivityEnterView4.senderSelectPopupWindow.getContentView().getMeasuredHeight();
                            int iMeasureKeyboardHeight2 = chatActivityEnterView4.delegate.measureKeyboardHeight();
                            if (iMeasureKeyboardHeight2 <= AndroidUtilities.dp(20.0f)) {
                                contentViewHeight2 += iMeasureKeyboardHeight2;
                            }
                            if (chatActivityEnterView4.emojiViewVisible) {
                                contentViewHeight2 -= chatActivityEnterView4.getEmojiPadding();
                            }
                            AndroidUtilities.dp(1.0f);
                            if (measuredHeight < (((i2 * 2) + contentViewHeight2) - ((chatActivity3 == null || !chatActivity3.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView4.senderSelectPopupWindow.headerText.getMeasuredHeight()) {
                                chatActivityEnterView4.getLocationInWindow(iArr);
                                iDp = ((iArr[1] - measuredHeight) - i2) - AndroidUtilities.dp(2.0f);
                            } else {
                                int i3 = (chatActivity3 == null || !chatActivity3.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                                chatActivityEnterView4.senderSelectPopupWindow.recyclerContainer.getLayoutParams().height = ((contentViewHeight2 - i3) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                                iDp = i3;
                            }
                            ChatActivityEnterView.AnonymousClass37 anonymousClass39 = chatActivityEnterView4.senderSelectPopupWindow;
                            ArrayList arrayList3 = anonymousClass39.springAnimations;
                            int size = arrayList3.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList3.get(i4);
                                i4++;
                                ((SpringAnimation) obj).cancel();
                            }
                            arrayList3.clear();
                            float fDp = AndroidUtilities.dp(8.0f);
                            ChatActivity.AnonymousClass60 anonymousClass60 = anonymousClass39.scrimPopupContainerLayout;
                            anonymousClass60.setPivotX(fDp);
                            anonymousClass60.setPivotY(anonymousClass60.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                            SenderSelectPopup.AnonymousClass1 anonymousClass2 = anonymousClass39.recyclerContainer;
                            anonymousClass2.setPivotX(0.0f);
                            anonymousClass2.setPivotY(0.0f);
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = anonymousClass39.sendAsPeers.peers;
                            TLRPC.Peer peer2 = anonymousClass39.defPeer;
                            if (peer2 != null) {
                                int iDp2 = AndroidUtilities.dp(54.0f);
                                c = 1;
                                int size2 = arrayList4.size() * iDp2;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList4.size()) {
                                        TLRPC.Peer peer3 = arrayList4.get(i5).peer;
                                        arrayList = arrayList3;
                                        long j2 = peer3.channel_id;
                                        if (j2 == 0 || j2 != peer2.channel_id) {
                                            long j3 = peer3.user_id;
                                            if (j3 == 0 || j3 != peer2.user_id) {
                                                long j4 = peer3.chat_id;
                                                if (j4 == 0 || j4 != peer2.chat_id) {
                                                    i5++;
                                                    arrayList3 = arrayList;
                                                }
                                            }
                                        }
                                        int size3 = arrayList4.size() - 1;
                                        RecyclerListView recyclerListView = anonymousClass39.recyclerView;
                                        int measuredHeight2 = (i5 == size3 || recyclerListView.getMeasuredHeight() >= size2) ? 0 : recyclerListView.getMeasuredHeight() % iDp2;
                                        LinearLayoutManager linearLayoutManager = anonymousClass39.layoutManager;
                                        linearLayoutManager.scrollToPositionWithOffset(i5, (size2 - ((arrayList4.size() - 2) * iDp2)) + AndroidUtilities.dp(7.0f) + measuredHeight2, linearLayoutManager.mShouldReverseLayout);
                                        if (recyclerListView.computeVerticalScrollOffset() > 0) {
                                            View view2 = anonymousClass39.headerShadow;
                                            view2.animate().cancel();
                                            view2.animate().alpha(1.0f).setDuration(150L).start();
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                c = 1;
                            }
                            anonymousClass60.setScaleX(0.25f);
                            anonymousClass60.setScaleY(0.25f);
                            anonymousClass2.setAlpha(0.25f);
                            SpringAnimation springAnimation = new SpringAnimation(anonymousClass60, DynamicAnimation.SCALE_X);
                            zzlt.m(1.0f, 750.0f, 1.0f, springAnimation);
                            springAnimation.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(anonymousClass39, 2));
                            SpringAnimation springAnimation2 = new SpringAnimation(anonymousClass60, DynamicAnimation.SCALE_Y);
                            zzlt.m(1.0f, 750.0f, 1.0f, springAnimation2);
                            springAnimation2.addUpdateListener(new SenderSelectPopup$$ExternalSyntheticLambda0(anonymousClass39, 3));
                            DynamicAnimation.AnonymousClass1 anonymousClass3 = DynamicAnimation.ALPHA;
                            SpringAnimation springAnimation3 = new SpringAnimation(anonymousClass60, anonymousClass3);
                            zzlt.m(1.0f, 750.0f, 1.0f, springAnimation3);
                            SpringAnimation springAnimation4 = new SpringAnimation(anonymousClass2, anonymousClass3);
                            zzlt.m(1.0f, 750.0f, 1.0f, springAnimation4);
                            SpringAnimation[] springAnimationArr = new SpringAnimation[4];
                            springAnimationArr[0] = springAnimation;
                            springAnimationArr[c] = springAnimation2;
                            springAnimationArr[2] = springAnimation3;
                            springAnimationArr[3] = springAnimation4;
                            for (SpringAnimation springAnimation5 : Arrays.asList(springAnimationArr)) {
                                arrayList.add(springAnimation5);
                                springAnimation5.addEndListener(new SenderSelectPopup$$ExternalSyntheticLambda3(anonymousClass39, springAnimation5, 1));
                                springAnimation5.start();
                            }
                            ChatActivityEnterView.AnonymousClass37 anonymousClass310 = chatActivityEnterView4.senderSelectPopupWindow;
                            chatActivityEnterView4.popupX = i;
                            chatActivityEnterView4.popupY = iDp;
                            anonymousClass310.showAtLocation(view, 51, i, iDp);
                            chatActivityEnterView4.senderSelectView.setProgress(1.0f);
                        }
                    }
                    break;
                } else {
                    chatActivityEnterView4.onEmojiSearchClosed = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView4, 1);
                    if (chatActivityEnterView4.isLiveComment) {
                        chatActivityEnterView4.hidePopup(true, false, true);
                    } else {
                        chatActivityEnterView4.hidePopup(true, true, true);
                    }
                }
                break;
            case 18:
                chatActivityEnterView.doneEditingMessage();
                break;
            case 19:
                AdjustPanLayoutHelper adjustPanLayoutHelper2 = chatActivityEnterView.adjustPanLayoutHelper;
                if (adjustPanLayoutHelper2 == null || !adjustPanLayoutHelper2.animationInProgress) {
                    if (chatActivityEnterView.emojiButtonRestricted) {
                        chatActivityEnterView.showRestrictedHint();
                    } else if (chatActivityEnterView.isPopupShowing() && chatActivityEnterView.currentPopupContentType == 0) {
                        if (chatActivityEnterView.searchingType != 0) {
                            chatActivityEnterView.setSearchingTypeInternal(0, true);
                            ChatActivityEnterView.AnonymousClass78 anonymousClass79 = chatActivityEnterView.emojiView;
                            if (anonymousClass79 != null) {
                                anonymousClass79.closeSearch(-1L, false);
                            }
                            ChatActivityEnterView.AnonymousClass50 anonymousClass54 = chatActivityEnterView.messageEditText;
                            if (anonymousClass54 != null) {
                                anonymousClass54.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.stickersExpanded) {
                            chatActivityEnterView.setStickersExpanded(false, true, false, true);
                            chatActivityEnterView.waitingForKeyboardOpenAfterAnimation = true;
                            AndroidUtilities.runOnUIThread(new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView, 14), 200L);
                        } else {
                            chatActivityEnterView.openKeyboardInternal();
                        }
                    } else {
                        chatActivityEnterView.showPopup(1, 0, true, true);
                        ChatActivityEnterView.AnonymousClass78 anonymousClass710 = chatActivityEnterView.emojiView;
                        ChatActivityEnterView.AnonymousClass50 anonymousClass55 = chatActivityEnterView.messageEditText;
                        boolean z7 = anonymousClass55 != null && anonymousClass55.length() > 0;
                        ChatActivity chatActivity4 = chatActivityEnterView.parentFragment;
                        if (chatActivity4 != null) {
                            HintView2 hintView2 = chatActivity4.groupEmojiPackHint;
                            if (hintView2 != null) {
                                if (hintView2.shown) {
                                    hintView2.hide(true);
                                }
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            chatActivity4.groupEmojiPackHint = null;
                            if (z2) {
                                z3 = true;
                            }
                        }
                        anonymousClass710.onOpen(z7, z3);
                    }
                }
                break;
            default:
                AdjustPanLayoutHelper adjustPanLayoutHelper3 = chatActivityEnterView.adjustPanLayoutHelper;
                if ((adjustPanLayoutHelper3 == null || !adjustPanLayoutHelper3.animationInProgress) && chatActivityEnterView.attachLayoutPaddingAlpha != 0.0f) {
                    chatActivityEnterView.delegate.didPressSuggestionButton();
                }
                break;
        }
    }
}
