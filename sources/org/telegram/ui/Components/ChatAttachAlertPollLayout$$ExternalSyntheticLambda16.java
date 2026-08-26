package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;

public final class ChatAttachAlertPollLayout$$ExternalSyntheticLambda16 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatAttachAlertPollLayout f$0;
    public final int f$1;

    public ChatAttachAlertPollLayout$$ExternalSyntheticLambda16(ChatAttachAlertPollLayout chatAttachAlertPollLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatAttachAlertPollLayout;
        this.f$1 = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setAttachedMedia(this.f$1, (PollAttachedMedia) obj);
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.f$0;
                chatAttachAlertPollLayout.getClass();
                chatAttachAlertPollLayout.setAttachedMedia(this.f$1, new PollAttachedMediaLink((String) obj));
                break;
        }
    }
}
