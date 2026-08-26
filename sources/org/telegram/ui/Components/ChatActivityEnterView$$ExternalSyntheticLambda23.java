package org.telegram.ui.Components;

public final class ChatActivityEnterView$$ExternalSyntheticLambda23 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;
    public final boolean f$1;

    public ChatActivityEnterView$$ExternalSyntheticLambda23(ChatActivityEnterView chatActivityEnterView, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showAiButton$53(this.f$1);
                break;
            case 1:
                this.f$0.lambda$showRichButton$55(this.f$1);
                break;
            default:
                this.f$0.lambda$onSendLongClick$50(this.f$1);
                break;
        }
    }
}
