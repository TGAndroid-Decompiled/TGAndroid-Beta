package org.telegram.ui.Components;

public final class ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertAudioLayout f$0;

    public ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0(ChatAttachAlertAudioLayout chatAttachAlertAudioLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertAudioLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAudio$4();
                break;
            case 1:
                this.f$0.lambda$new$1();
                break;
            case 2:
                this.f$0.searchChats();
                break;
            default:
                this.f$0.searchGlobal();
                break;
        }
    }
}
