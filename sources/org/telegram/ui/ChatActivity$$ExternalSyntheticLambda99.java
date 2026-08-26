package org.telegram.ui;

import androidx.core.util.Consumer;

public final class ChatActivity$$ExternalSyntheticLambda99 implements Consumer {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda99(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                chatActivity.waitingForGetDifference = zBooleanValue;
                if (!zBooleanValue) {
                    chatActivity.firstLoadMessages();
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                if (num.intValue() != 0) {
                    chatActivity2.updateReactionsMentionButton(true);
                    chatActivity2.scrollToMessageId(num.intValue(), 0, false, 0, true, 0);
                } else {
                    chatActivity2.reactionsMentionCount = 0;
                    chatActivity2.updateReactionsMentionButton(true);
                    chatActivity2.getMessagesController().markReactionsAsRead(chatActivity2.dialog_id, chatActivity2.getTopicId());
                }
                break;
            default:
                Integer num2 = (Integer) obj;
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                if (num2.intValue() != 0) {
                    int i = chatActivity3.pollVotesMentionCount - 1;
                    chatActivity3.pollVotesMentionCount = i;
                    if (i <= 0) {
                        chatActivity3.getMessagesController().markPollVotesAsRead(chatActivity3.dialog_id, chatActivity3.getTopicId());
                    }
                    chatActivity3.updatePollVotesMentionButton(true);
                    chatActivity3.scrollToMessageId(num2.intValue(), 0, false, 0, true, 0);
                } else {
                    chatActivity3.pollVotesMentionCount = 0;
                    chatActivity3.updatePollVotesMentionButton(true);
                    chatActivity3.getMessagesController().markPollVotesAsRead(chatActivity3.dialog_id, chatActivity3.getTopicId());
                }
                break;
        }
    }
}
