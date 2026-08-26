package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager;
import org.telegram.ui.bots.BotCommandsMenuView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public final class ChatActivityEnterView$$ExternalSyntheticLambda90 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda90(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatActivityEnterView.getClass();
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i = chatActivityEnterView.currentAccount;
                long j = chatActivityEnterView.dialog_id;
                String str = chatActivityEnterView.botMenuWebViewTitle;
                String str2 = chatActivityEnterView.botMenuWebViewUrl;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, str, str2, 2, 0, chatActivity == null ? 0L : chatActivity.getSendMonoForumPeerId(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null && launchActivity.getBottomSheetTabs() != null && LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) != null) {
                    BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
                    if (botCommandsMenuView != null) {
                        botCommandsMenuView.setOpened(false);
                    }
                } else if (!LinkManager.isWebAppLink(chatActivityEnterView.botMenuWebViewUrl)) {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.currentAccount).getUser(Long.valueOf(chatActivityEnterView.dialog_id));
                    String restrictionReason = MessagesController.getInstance(chatActivityEnterView.currentAccount).getRestrictionReason(user == null ? null : user.restriction_reason);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.currentAccount);
                        MessagesController.showCantOpenAlert(chatActivity, restrictionReason);
                    } else {
                        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(chatActivityEnterView.getContext(), chatActivityEnterView.resourcesProvider);
                        botWebViewSheet.setDefaultFullsize(false);
                        botWebViewSheet.needsContext = true;
                        botWebViewSheet.parentActivity = chatActivityEnterView.parentActivity;
                        botWebViewSheet.requestWebView(chatActivity, webViewRequestPropsOf);
                        botWebViewSheet.show();
                        BotCommandsMenuView botCommandsMenuView2 = chatActivityEnterView.botCommandsMenuButton;
                        if (botCommandsMenuView2 != null) {
                            botCommandsMenuView2.setOpened(false);
                        }
                    }
                } else {
                    Browser.Progress progress = new Browser.Progress();
                    progress.onEndListener = new ChatActivityEnterView$$ExternalSyntheticLambda4(chatActivityEnterView, 4);
                    Browser.openAsInternalIntent(chatActivityEnterView.getContext(), chatActivityEnterView.botMenuWebViewUrl, false, false, progress);
                }
                break;
            case 1:
                if (chatActivityEnterView.botCommandsMenuButton != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
                    chatActivityEnterView.botCommandsMenuButton.setOpened(false);
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.didPressSuggestionButton();
                }
                break;
            case 3:
                ChatActivityEnterView.AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                if (anonymousClass50 != null) {
                    anonymousClass50.setText("");
                }
                break;
            case 4:
                ChatActivityEnterView.AnonymousClass50 anonymousClass51 = chatActivityEnterView.messageEditText;
                if (anonymousClass51 != null) {
                    anonymousClass51.setText("");
                }
                chatActivityEnterView.checkSendButton(true);
                break;
            default:
                int i2 = ChatActivityEnterView.$r8$clinit;
                chatActivityEnterView.checkBirthdayHint();
                break;
        }
    }
}
