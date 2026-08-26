package org.telegram.ui;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda9(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didPressToDoButton$38();
                break;
            case 1:
                this.f$0.lambda$didLongPressPollOption$37();
                break;
            case 2:
                this.f$0.lambda$appendMention$13();
                break;
            case 3:
                this.f$0.lambda$needShowPremiumBulletin$26();
                break;
            case 4:
                this.f$0.lambda$needShowPremiumBulletin$27();
                break;
            case 5:
                this.f$0.lambda$needShowPremiumBulletin$28();
                break;
            case 6:
                this.f$0.lambda$didPressMoreChannelRecommendations$39();
                break;
            case 7:
                this.f$0.lambda$didLongPressToDoButton$30();
                break;
            case 8:
                this.f$0.lambda$didPressRevealSensitiveContent$55();
                break;
            default:
                this.f$0.lambda$appendMention$14();
                break;
        }
    }
}
