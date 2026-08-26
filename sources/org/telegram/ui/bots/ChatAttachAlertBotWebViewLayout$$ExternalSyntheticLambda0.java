package org.telegram.ui.bots;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertBotWebViewLayout f$0;

    public ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda0(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertBotWebViewLayout;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.webViewContainer.restoreButtonData();
                break;
            case 1:
                this.f$0.requestEnableKeyboard();
                break;
            case 2:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.f$0;
                if (!chatAttachAlertBotWebViewLayout.destroyed) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputUser(chatAttachAlertBotWebViewLayout.botId);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.peerId);
                    tL_messages_prolongWebView.query_id = chatAttachAlertBotWebViewLayout.queryId;
                    tL_messages_prolongWebView.silent = false;
                    if (chatAttachAlertBotWebViewLayout.replyToMsgId != 0) {
                        TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).createReplyInput(chatAttachAlertBotWebViewLayout.replyToMsgId);
                        tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
                        if (chatAttachAlertBotWebViewLayout.monoforumTopicId != 0) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.monoforumTopicId);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (chatAttachAlertBotWebViewLayout.monoforumTopicId != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(chatAttachAlertBotWebViewLayout.monoforumTopicId);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (chatAttachAlertBotWebViewLayout.peerId < 0 && (chatFull = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getChatFull(-chatAttachAlertBotWebViewLayout.peerId)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).sendRequest(tL_messages_prolongWebView, new RichMediaUploader$$ExternalSyntheticLambda0(chatAttachAlertBotWebViewLayout, 26));
                }
                break;
            case 3:
                this.f$0.lambda$new$3$2$2();
                break;
            default:
                this.f$0.webViewContainer.invalidateViewPortHeight(true);
                break;
        }
    }
}
