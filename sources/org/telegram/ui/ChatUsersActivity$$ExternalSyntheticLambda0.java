package org.telegram.ui;

public final class ChatUsersActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatUsersActivity f$0;

    public ChatUsersActivity$$ExternalSyntheticLambda0(ChatUsersActivity chatUsersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatUsersActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatUsersActivity chatUsersActivity = this.f$0;
                if (!chatUsersActivity.loadingUsers) {
                    chatUsersActivity.contactsEndReached = false;
                    chatUsersActivity.botsEndReached = false;
                    chatUsersActivity.loadChatParticipants$1();
                    break;
                }
                break;
            default:
                ChatUsersActivity chatUsersActivity2 = this.f$0;
                chatUsersActivity2.getMessagesController().loadFullChat(chatUsersActivity2.chatId, 0, true);
                break;
        }
    }
}
