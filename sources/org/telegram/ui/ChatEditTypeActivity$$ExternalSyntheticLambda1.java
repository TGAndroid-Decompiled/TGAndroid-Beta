package org.telegram.ui;

public final class ChatEditTypeActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatEditTypeActivity f$0;

    public ChatEditTypeActivity$$ExternalSyntheticLambda1(ChatEditTypeActivity chatEditTypeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditTypeActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatEditTypeActivity chatEditTypeActivity = this.f$0;
                chatEditTypeActivity.canCreatePublic = true;
                if (chatEditTypeActivity.usernameTextView.length() > 0) {
                    chatEditTypeActivity.checkUserName$1$1(chatEditTypeActivity.usernameTextView.getText().toString());
                }
                chatEditTypeActivity.updatePrivatePublic$1();
                break;
            case 1:
                ChatEditTypeActivity chatEditTypeActivity2 = this.f$0;
                chatEditTypeActivity2.canCreatePublic = true;
                chatEditTypeActivity2.updatePrivatePublic$1();
                break;
            case 2:
                ChatEditTypeActivity chatEditTypeActivity3 = this.f$0;
                chatEditTypeActivity3.currentChat = chatEditTypeActivity3.getMessagesController().getChat(Long.valueOf(chatEditTypeActivity3.chatId));
                chatEditTypeActivity3.processDone$6();
                break;
            case 3:
                this.f$0.updateDoneProgress$1(false);
                break;
            case 4:
                this.f$0.processDone$6();
                break;
            default:
                this.f$0.updateDoneProgress$1(true);
                break;
        }
    }
}
