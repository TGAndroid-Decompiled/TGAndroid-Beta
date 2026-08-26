package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;
    public final MessageObject f$1;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = this.f$0;
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.createUndoView();
                UndoView undoView = chatActivity.undoView;
                if (undoView != null) {
                    int i = (chatActivity.chatActivityEnterView.getVisibility() != 0 || chatActivity.bottomOverlay.getVisibility() == 0) ? 17 : 16;
                    MessageObject messageObject = this.f$1;
                    undoView.showWithAction(0L, i, messageObject.getDiceEmoji(), (Object) null, (Runnable) null, new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1(chatMessageCellDelegate, messageObject, 2));
                    break;
                }
                break;
            case 1:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = this.f$0;
                chatMessageCellDelegate2.getClass();
                int id = this.f$1.getId();
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.progressDialogAtMessageId = id;
                chatActivity2.progressDialogAtMessageType = 0;
                break;
            default:
                ChatActivity chatActivity3 = ChatActivity.this;
                if (chatActivity3.checkSlowModeAlert()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.f$1.getDiceEmoji(), chatActivity3.dialog_id, chatActivity3.replyingMessageObject, chatActivity3.threadMessageObject, null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf.sendMessageChatArguments = chatActivity3.getMessageChatSendParams();
                    chatActivity3.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                }
                break;
        }
    }
}
