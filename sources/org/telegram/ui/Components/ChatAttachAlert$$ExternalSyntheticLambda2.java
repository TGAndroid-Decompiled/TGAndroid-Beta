package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class ChatAttachAlert$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda2(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$19((CharSequence) obj);
                break;
            default:
                this.f$0.lambda$new$23((CharSequence) obj);
                break;
        }
    }
}
