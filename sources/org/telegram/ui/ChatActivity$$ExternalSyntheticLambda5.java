package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda5(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() throws Throwable {
        ChatActivity.AnonymousClass39 anonymousClass39;
        View sendButton;
        View sendButton2;
        HintView2 hintView2;
        ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatActivity.finishFragment();
                break;
            case 1:
                ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity.chatActivityEnterView;
                if (anonymousClass310 != null && chatActivity.pollAddOptionFieldLayout != null) {
                    if (anonymousClass310.isPopupShowing()) {
                        chatActivity.chatActivityEnterView.hidePopup(false, false, true);
                        AndroidUtilities.showKeyboard(chatActivity.pollAddOptionFieldLayout.textView);
                        chatActivity.pollAddOptionFieldLayout.emojiButton.animatorIsEmojiVisible.setValue(false, true);
                    } else {
                        chatActivity.chatActivityEnterView.setAllowStickersAndGifs(false, false, false);
                        chatActivity.chatActivityEnterView.showPopup$1();
                        chatActivity.pollAddOptionFieldLayout.emojiButton.animatorIsEmojiVisible.setValue(true, true);
                    }
                    break;
                }
                break;
            case 2:
                chatActivity.pollAddOptionModeClose();
                break;
            case 3:
                ChatActivity.AnonymousClass75 anonymousClass75 = chatActivity.videoPlayerContainer;
                if (anonymousClass75 != null && anonymousClass75.getParent() != null) {
                    chatActivity.chatListView.invalidateViews();
                    chatActivity.aspectRatioFrameLayout.setDrawingReady(false);
                    chatActivity.videoPlayerContainer.setTag(null);
                    chatActivity.contentView.removeView(chatActivity.videoPlayerContainer);
                    break;
                }
                break;
            case 4:
                chatActivity.dimBehindView(false, true, 0.0f);
                break;
            case 5:
                chatActivity.hideActionMode();
                chatActivity.updatePinnedMessageView(0, true);
                break;
            case 6:
                chatActivity.dimBehindView(false, true, 0.0f);
                break;
            case 7:
                chatActivity.dimBehindView(false, true, 0.0f);
                break;
            case 8:
                if (chatActivity.getParentActivity() != null && chatActivity.fragmentView != null && (anonymousClass39 = chatActivity.chatActivityEnterView) != null && (sendButton = anonymousClass39.getSendButton()) != null && chatActivity.chatActivityEnterView.getEditField() != null && chatActivity.chatActivityEnterView.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (chatActivity.scheduledOrNoSoundHint == null) {
                        ChatActivity.AnonymousClass13 anonymousClass13 = new ChatActivity.AnonymousClass13(4, chatActivity.getParentActivity(), chatActivity.themeDelegate, false);
                        chatActivity.scheduledOrNoSoundHint = anonymousClass13;
                        anonymousClass13.createCloseButton();
                        chatActivity.scheduledOrNoSoundHint.setAlpha(0.0f);
                        chatActivity.scheduledOrNoSoundHint.setVisibility(4);
                        chatActivity.scheduledOrNoSoundHint.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        chatActivity.contentView.addView(chatActivity.scheduledOrNoSoundHint, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    chatActivity.scheduledOrNoSoundHint.showForView(sendButton, true);
                    chatActivity.scheduledOrNoSoundHintShown = true;
                    break;
                }
                break;
            case 9:
                chatActivity.getClass();
                AlertDialog alertDialog = new AlertDialog(chatActivity.getParentActivity(), 3, chatActivity.themeDelegate);
                chatActivity.progressDialog = alertDialog;
                alertDialog.setOnShowListener(new ChatActivity$$ExternalSyntheticLambda192(chatActivity, 1));
                chatActivity.progressDialog.setOnCancelListener(chatActivity.postponedScrollCancelListener);
                chatActivity.progressDialog.showDelayed(500L);
                break;
            case 10:
                if (chatActivity.getParentActivity() != null && chatActivity.fragmentView != null && chatActivity.chatActivityEnterView != null && chatActivity.forwardingPreviewView == null && chatActivity.getMessagesController().getSendPaidMessagesStars(chatActivity.getDialogId()) <= 0 && (sendButton2 = chatActivity.chatActivityEnterView.getSendButton()) != null && chatActivity.chatActivityEnterView.getEditField() != null && chatActivity.chatActivityEnterView.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (chatActivity.scheduledHint == null) {
                        HintView hintView = new HintView(4, chatActivity.getParentActivity(), chatActivity.themeDelegate, false);
                        chatActivity.scheduledHint = hintView;
                        hintView.createCloseButton();
                        chatActivity.scheduledHint.setAlpha(0.0f);
                        chatActivity.scheduledHint.setVisibility(4);
                        chatActivity.scheduledHint.setText(LocaleController.getString(R.string.ScheduledHint));
                        chatActivity.contentView.addView(chatActivity.scheduledHint, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    chatActivity.scheduledHint.showForView(sendButton2, true);
                    chatActivity.scheduledHintShown = true;
                    break;
                }
                break;
            case 11:
                chatActivity.getClass();
                chatActivity.lastTranslationCheck = System.currentTimeMillis();
                if (chatActivity.chatListView != null && chatActivity.chatAdapter != null) {
                    int iMin = Integer.MAX_VALUE;
                    int iMax = Integer.MIN_VALUE;
                    for (int i = 0; i < chatActivity.chatListView.getChildCount(); i++) {
                        View childAt = chatActivity.chatListView.getChildAt(i);
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            if (chatMessageCell.getCurrentMessagesGroup() != null) {
                                for (int i2 = 0; i2 < chatMessageCell.getCurrentMessagesGroup().messages.size(); i2++) {
                                    int id = chatMessageCell.getCurrentMessagesGroup().messages.get(i2).getId();
                                    iMin = Math.min(iMin, id);
                                    iMax = Math.max(iMax, id);
                                }
                            } else if (chatMessageCell.getMessageObject() != null) {
                                int id2 = chatMessageCell.getMessageObject().getId();
                                iMin = Math.min(iMin, id2);
                                iMax = Math.max(iMax, id2);
                            }
                        }
                    }
                    if (iMin <= iMax) {
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList2 = chatActivity.messages;
                            if (i3 < arrayList2.size()) {
                                MessageObject messageObject = (MessageObject) arrayList2.get(i3);
                                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) chatActivity.groupedMessagesMap.get(messageObject.getGroupId());
                                if (groupedMessages == null) {
                                    int id3 = messageObject.getId();
                                    chatActivity.getMessagesController().getTranslateController().checkTranslation(messageObject, id3 >= iMin + (-7) && id3 <= iMax + 7);
                                } else if (!arrayList.contains(Long.valueOf(groupedMessages.groupId))) {
                                    for (int i4 = 0; i4 < groupedMessages.messages.size(); i4++) {
                                        MessageObject messageObject2 = groupedMessages.messages.get(i4);
                                        if (messageObject2 != null) {
                                            int id4 = messageObject2.getId();
                                            chatActivity.getMessagesController().getTranslateController().checkTranslation(messageObject2, id4 >= iMin + (-7) && id4 <= iMax + 7);
                                        }
                                    }
                                    arrayList.add(Long.valueOf(groupedMessages.groupId));
                                }
                                i3++;
                            }
                        }
                    }
                }
                if (chatActivity.currentPinnedMessageId > 0 && chatActivity.pinnedMessageObjects != null) {
                    chatActivity.getMessagesController().getTranslateController().checkTranslation((MessageObject) chatActivity.pinnedMessageObjects.get(Integer.valueOf(chatActivity.currentPinnedMessageId)), true);
                }
                chatActivity.updateTranslateItemVisibility();
                break;
            case 12:
                chatActivity.checkEditTimer();
                break;
            case 13:
                chatActivity.onBottomItemsVisibilityChanged();
                break;
            case 14:
                chatActivity.invalidateMergedVisibleBlurredPositionsAndSources$1(2);
                break;
            case 15:
                chatActivity.shareAlertDebugMode = (chatActivity.shareAlertDebugMode + 1) % 3;
                break;
            case 16:
                chatActivity.shareAlertDebugTopicsSlowMotion = !chatActivity.shareAlertDebugTopicsSlowMotion;
                break;
            case 17:
                chatActivity.checkScrollForLoad$1(false);
                break;
            case 18:
                chatActivity.closeMenu(true);
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.TranscriptionReportSent, BulletinFactory.of(chatActivity), R.raw.chats_infotip, 36);
                break;
            case 19:
                chatActivity.chatAdapter.frozenMessages.clear();
                ChatActivity.ChatActivityAdapter chatActivityAdapter = chatActivity.chatAdapter;
                chatActivityAdapter.isFrozen = false;
                chatActivityAdapter.notifyDataSetChanged(true);
                chatActivity.showProgressView$1(false);
                break;
            case 20:
                chatActivity.commentLoadingMessageId = 0;
                chatActivity.hideCommentLoading = false;
                chatActivity.chatListView.invalidateViews();
                break;
            case 21:
                chatActivity.invalidateChatListViewTopPadding();
                chatActivity.invalidateMessagesVisiblePart();
                chatActivity.checkUi_messagesSearchListPadding();
                chatActivity.checkUi_topFade();
                break;
            case 22:
                chatActivity.invalidateMergedVisibleBlurredPositionsAndSources$1(5);
                break;
            case 23:
                ChatActivity.AnonymousClass60 anonymousClass60 = chatActivity.searchContainer;
                if ((anonymousClass60 == null || anonymousClass60.getVisibility() != 0) && (hintView2 = chatActivity.savedMessagesSearchHint) != null) {
                    hintView2.show();
                }
                break;
            case 24:
                chatActivity.checkUi_avatarContainerVisibility();
                break;
            case 25:
                chatActivity.invalidateMergedVisibleBlurredPositionsAndSources$1(5);
                break;
            case 26:
                chatActivity.updatePinnedMessageView(0, chatActivity.openAnimationStartTime != 0 && SystemClock.elapsedRealtime() >= chatActivity.openAnimationStartTime + 150);
                break;
            case 27:
                chatActivity.getClass();
                BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).show();
                break;
            case 28:
                int i5 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.checkSavedMessagesTagHint();
                break;
            default:
                int i6 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.checkSavedMessagesTagHint();
                break;
        }
    }
}
