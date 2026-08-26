package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda10(ChatActivity chatActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.updatePinnedMessageView(0, this.f$1);
                break;
            default:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                chatActivity.presentFragment(new PremiumPreviewFragment(0, this.f$1 ? "upload_speed" : "download_speed"));
                break;
        }
    }
}
