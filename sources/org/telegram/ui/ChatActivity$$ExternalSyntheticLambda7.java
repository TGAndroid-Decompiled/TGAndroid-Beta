package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda7(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeKeyboardPositionBeforeTransition$207();
                break;
            case 1:
                this.f$0.lambda$deleteHistory$2();
                break;
            case 2:
                this.f$0.lambda$createTopicsTabs$96();
                break;
            case 3:
                this.f$0.lambda$createTopicsTabs$97();
                break;
            case 4:
                this.f$0.lambda$onPageDownClicked$108();
                break;
            case 5:
                this.f$0.updateBottomOverlay();
                break;
            case 6:
                this.f$0.lambda$checkSecretMessageForLocation$198();
                break;
            case 7:
                this.f$0.lambda$searchLinks$132();
                break;
            case 8:
                this.f$0.lambda$searchLinks$133();
                break;
            case 9:
                this.f$0.lambda$showPinnedProgress$162();
                break;
            case 10:
                this.f$0.lambda$checkGroupEmojiPackHint$208();
                break;
            default:
                this.f$0.lambda$updateSelectedMessageReactions$165();
                break;
        }
    }
}
