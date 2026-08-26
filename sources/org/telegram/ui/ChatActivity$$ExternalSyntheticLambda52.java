package org.telegram.ui;

import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda52 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final ScrimOptions f$1;
    public final String f$2;

    public ChatActivity$$ExternalSyntheticLambda52(ChatActivity chatActivity, ScrimOptions scrimOptions, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = scrimOptions;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressFormattedDate$417(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$didLongPressUsername$428(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$didLongPressCard$422(this.f$1, this.f$2);
                break;
        }
    }
}
