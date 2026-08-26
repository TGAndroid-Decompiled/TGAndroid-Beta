package org.telegram.ui;

import androidx.core.util.Consumer;

public final class ChatActivity$$ExternalSyntheticLambda206 implements Consumer {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda206(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSideControlButtonOnClick$470((Integer) obj);
                break;
            case 1:
                this.f$0.lambda$onSideControlButtonOnClick$471((Integer) obj);
                break;
            default:
                this.f$0.lambda$onFragmentCreate$10((Boolean) obj);
                break;
        }
    }
}
