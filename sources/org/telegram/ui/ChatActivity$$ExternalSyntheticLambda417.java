package org.telegram.ui;

import android.view.View;

public final class ChatActivity$$ExternalSyntheticLambda417 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda417(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createPinnedMessageView$113(view);
                break;
            case 1:
                this.f$0.lambda$createPinnedMessageView$114(view);
                break;
            case 2:
                this.f$0.lambda$createPinnedMessageView$116(view);
                break;
            case 3:
                this.f$0.lambda$showGreetInfo$310(view);
                break;
            default:
                this.f$0.lambda$createAddProfilePictureButton$94(view);
                break;
        }
    }
}
