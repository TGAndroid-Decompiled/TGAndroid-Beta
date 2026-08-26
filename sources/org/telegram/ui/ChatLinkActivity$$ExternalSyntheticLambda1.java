package org.telegram.ui;

public final class ChatLinkActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity f$0;

    public ChatLinkActivity$$ExternalSyntheticLambda1(ChatLinkActivity chatLinkActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatLinkActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showLinkAlert$8();
                break;
            case 1:
                this.f$0.lambda$linkChat$11();
                break;
            default:
                this.f$0.lambda$createView$0();
                break;
        }
    }
}
