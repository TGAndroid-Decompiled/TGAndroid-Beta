package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda22(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        ActionBarMenuSubItem actionBarMenuSubItem;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification_messagesDidLoad$170();
                break;
            case 1:
                ChatActivity chatActivity = this.f$0;
                chatActivity.closeMenu(false);
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(chatActivity, chatActivity.getParentActivity(), chatActivity.getCurrentAccount(), false, 24, true, null);
                premiumFeatureBottomSheet.setDimBehind(false);
                premiumFeatureBottomSheet.setOnHideListener(new ChatActivity$$ExternalSyntheticLambda19(chatActivity, 7));
                premiumFeatureBottomSheet.show();
                break;
            case 2:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.resumeDelayedFragmentAnimation();
                ChatActivity.AnonymousClass3 anonymousClass3 = chatActivity2.fragmentTransitionRunnable;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass3);
                anonymousClass3.run();
                chatActivity2.getNotificationCenter().runDelayedNotifications();
                break;
            case 3:
                this.f$0.lambda$updateTopPanel$236();
                break;
            case 4:
                ChatActivity chatActivity3 = this.f$0;
                if (!chatActivity3.getUserConfig().isPremium()) {
                    chatActivity3.showDialog(new PremiumFeatureBottomSheet(chatActivity3, chatActivity3.getParentActivity(), chatActivity3.getCurrentAccount(), false, 3, true, null));
                } else {
                    chatActivity3.botSponsoredMessage = null;
                    chatActivity3.updateTopPanel(true);
                    BulletinFactory.of(chatActivity3).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                    chatActivity3.getMessagesController().disableAds(true);
                }
                break;
            case 5:
                ChatActivity.AnonymousClass39 anonymousClass39 = this.f$0.chatActivityEnterView;
                if (anonymousClass39 != null) {
                    anonymousClass39.hideTopView(true);
                }
                break;
            case 6:
                AndroidUtilities.removeFromParent(this.f$0.guestBotHintView);
                break;
            case 7:
                ChatActivity chatActivity4 = this.f$0;
                chatActivity4.highlightMessageId = Integer.MAX_VALUE;
                chatActivity4.highlightMessageQuoteFirst = false;
                chatActivity4.highlightMessageQuoteFirstTime = 0L;
                chatActivity4.highlightMessageQuote = null;
                chatActivity4.highlightTaskId = null;
                chatActivity4.highlightPollOptionId = null;
                chatActivity4.highlightMessageQuoteOffset = -1;
                chatActivity4.showNoQuoteAlert = false;
                chatActivity4.updateVisibleRows$1(false);
                chatActivity4.unselectRunnable = null;
                break;
            case 8:
                ChatActivity chatActivity5 = this.f$0;
                chatActivity5.cancelFixedPositionRunnable = null;
                chatActivity5.fixedKeyboardHeight = -1;
                View view = chatActivity5.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
                break;
            case 9:
                int i = 0;
                while (true) {
                    ChatActivity chatActivity6 = this.f$0;
                    ArrayList arrayList = chatActivity6.messages;
                    if (i >= arrayList.size()) {
                        chatActivity6.newMentionsCount = 0;
                        chatActivity6.getMessagesController().markMentionsAsRead(chatActivity6.dialog_id, chatActivity6.getTopicId());
                        chatActivity6.hasAllMentionsLocal = true;
                        chatActivity6.showMentionDownButton(false);
                        ActionBarPopupWindow actionBarPopupWindow = chatActivity6.scrimPopupWindow;
                        if (actionBarPopupWindow != null) {
                            actionBarPopupWindow.dismiss();
                        }
                    } else {
                        MessageObject messageObject = (MessageObject) arrayList.get(i);
                        if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                            messageObject.setContentIsRead();
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 10:
                int i2 = 0;
                while (true) {
                    ChatActivity chatActivity7 = this.f$0;
                    ArrayList arrayList2 = chatActivity7.messages;
                    if (i2 >= arrayList2.size()) {
                        chatActivity7.reactionsMentionCount = 0;
                        chatActivity7.updateReactionsMentionButton(true);
                        chatActivity7.getMessagesController().markReactionsAsRead(chatActivity7.dialog_id, chatActivity7.getTopicId());
                        ActionBarPopupWindow actionBarPopupWindow2 = chatActivity7.scrimPopupWindow;
                        if (actionBarPopupWindow2 != null) {
                            actionBarPopupWindow2.dismiss();
                        }
                    } else {
                        ((MessageObject) arrayList2.get(i2)).markReactionsAsRead();
                        i2++;
                    }
                    break;
                }
                break;
            case 11:
                int i3 = 0;
                while (true) {
                    ChatActivity chatActivity8 = this.f$0;
                    ArrayList arrayList3 = chatActivity8.messages;
                    if (i3 >= arrayList3.size()) {
                        chatActivity8.pollVotesMentionCount = 0;
                        chatActivity8.updatePollVotesMentionButton(true);
                        chatActivity8.getMessagesController().markPollVotesAsRead(chatActivity8.dialog_id, chatActivity8.getTopicId());
                        ActionBarPopupWindow actionBarPopupWindow3 = chatActivity8.scrimPopupWindow;
                        if (actionBarPopupWindow3 != null) {
                            actionBarPopupWindow3.dismiss();
                        }
                    } else {
                        ((MessageObject) arrayList3.get(i3)).markPollVotesAsRead();
                        i3++;
                    }
                    break;
                }
                break;
            case 12:
                this.f$0.updateBottomOverlay(false);
                break;
            case 13:
                ChatActivity chatActivity9 = this.f$0;
                chatActivity9.foundWebPage = null;
                chatActivity9.fallbackFieldPanel();
                break;
            case 14:
                ChatActivity chatActivity10 = this.f$0;
                chatActivity10.foundWebPage = null;
                chatActivity10.fallbackFieldPanel();
                break;
            case 15:
                this.f$0.lambda$scrollToLastMessage$152();
                break;
            case 16:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 17:
                AndroidUtilities.removeFromParent(this.f$0.bottomSuggestHintView);
                break;
            case 18:
                ChatActivity chatActivity11 = this.f$0;
                chatActivity11.checkPaddingsRunnable = null;
                chatActivity11.invalidateChatListViewTopPadding();
                chatActivity11.invalidateMessagesVisiblePart();
                break;
            case 19:
                ChatActivity chatActivity12 = this.f$0;
                chatActivity12.waitingForSendingMessageLoad = false;
                chatActivity12.hideFieldPanel(true);
                break;
            case 20:
                ChatActivity chatActivity13 = this.f$0;
                ActionBarMenuSubItem[] actionBarMenuSubItemArr = chatActivity13.scrimPopupWindowItems;
                if (actionBarMenuSubItemArr != null && actionBarMenuSubItemArr.length > 0 && (actionBarMenuSubItem = actionBarMenuSubItemArr[0]) != null) {
                    actionBarMenuSubItem.requestFocus();
                    chatActivity13.scrimPopupWindowItems[0].performAccessibilityAction(64, null);
                    chatActivity13.scrimPopupWindowItems[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 21:
                this.f$0.lambda$updateBottomOverlay$220();
                break;
            case 22:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 23:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 24:
                this.f$0.lambda$processSelectedOption$350();
                break;
            case 25:
                this.f$0.chatActivityEnterView.openKeyboard();
                break;
            case 26:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 27:
                ChatActivity chatActivity14 = this.f$0;
                chatActivity14.chatAdapter.frozenMessages.clear();
                ChatActivity.ChatActivityAdapter chatActivityAdapter = chatActivity14.chatAdapter;
                chatActivityAdapter.isFrozen = false;
                chatActivityAdapter.notifyDataSetChanged(true);
                chatActivity14.showProgressView$1(false);
                break;
            case 28:
                AndroidUtilities.removeFromParent(this.f$0.bottomGiftHintView);
                break;
            default:
                this.f$0.checkInsets();
                break;
        }
    }
}
