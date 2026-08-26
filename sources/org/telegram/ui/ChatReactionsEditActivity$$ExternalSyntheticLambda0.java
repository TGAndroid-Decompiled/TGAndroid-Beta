package org.telegram.ui;

public final class ChatReactionsEditActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatReactionsEditActivity f$0;

    public ChatReactionsEditActivity$$ExternalSyntheticLambda0(ChatReactionsEditActivity chatReactionsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatReactionsEditActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$1();
                break;
            case 1:
                this.f$0.lambda$createView$3();
                break;
            default:
                this.f$0.lambda$createView$5();
                break;
        }
    }
}
